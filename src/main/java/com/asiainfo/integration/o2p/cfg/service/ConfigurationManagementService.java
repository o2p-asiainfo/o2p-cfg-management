/** 
 * Project Name:o2p-configuration-management 
 * File Name:java 
 * Package Name:com.asiainfo.eaap.integration.service 
 * Date:2015年8月31日下午3:04:42 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.cfg.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import net.sf.json.JSONObject;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.ailk.eaap.o2p.common.security.SecurityUtil;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.foundation.util.MessageSourceUtils;
import com.asiainfo.integration.o2p.cfg.dao.ConfigurationManagementDAO;
import com.asiainfo.integration.o2p.cfg.dto.CfgProperties;
import com.asiainfo.integration.o2p.cfg.dto.CfgPropertiesJson;
import com.asiainfo.integration.o2p.cfg.dto.OperateProcess;
import com.asiainfo.integration.o2p.cfg.dto.ZkPath;
import com.asiainfo.integration.o2p.cfg.util.CfgException;
import com.asiainfo.integration.o2p.cfg.util.Constant;
import com.asiainfo.integration.o2p.cfg.util.CommonUtil;
import com.asiainfo.integration.o2p.cfg.zookeeper.Curator;

@Service("configurationManagementService")
@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
public class ConfigurationManagementService
{
    private static final Logger log = Logger
            .getLog(ConfigurationManagementService.class);
    public static final String separator = "/";
    public static final String default_path = "/DCN";
    		
    @Autowired
    ConfigurationManagementDAO configurationManagementDAO;
    private Curator curator;
    
    @Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
    public Map<String, Object> syncDbToZookeeper(OperateProcess operateProcess) throws Exception
    {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("dirType", Constant.DIRECTORY_SPEC_PROPERTIES);
        long begin = System.currentTimeMillis();
        List<ZkPath> pathList = configurationManagementDAO.getZkPath(params);
        long end = System.currentTimeMillis();
        if(log.isDebugEnabled()) {
        	log.debug("get zkpath use time {0}", (end-begin));
        }
        if(pathList != null) {
        	String treePath = null;
        	Map<String, Object> confParams = new HashMap<String, Object>();
        	begin = System.currentTimeMillis();
        	for(ZkPath path: pathList) {
        		confParams.put("dirId", path.getId());
        		treePath = getPathByZKPathId(path.getId());
        		List<CfgProperties> list = configurationManagementDAO.getConf(confParams);
                for (CfgProperties conf : list)
                {
                	if(!StringUtils.hasText(conf.getKey())) {
                		log.warn("exist empty key in the namespace {0}", treePath);
                		continue;
                	}
                    String fullPath = treePath + separator + conf.getKey();
                    Object obj = getCurator().existsZNode(fullPath);
                    if (null == obj)
                    {
                    	if(log.isDebugEnabled()) {
                    		log.debug("sync db conf to zk, key = {0}, value = {1} ", conf.getKey(), (conf.getValue() == null? conf.getValue(): conf.getProValueBuffer()));
                    	}
                        String result = getCurator().createZNode(fullPath, getCfgPropertiesJson(conf));
                        if (result.equals(fullPath))
                        {// 修改数据信息
                            Map<String, Object> param = new HashMap<String, Object>();
                            param.put("id", conf.getId());
                            param.put("synStatus", "1");
                            param.put("modifyDt", new Date());
                            int count = configurationManagementDAO.updateConf(param);
                            if (count < 1)
                            {
                                getCurator().deleteZNode(fullPath);
                            }
                        }
                    }
                }
        	}
        	end = System.currentTimeMillis();
        	if(log.isDebugEnabled()) {
        		log.debug("sync db to zk end use time {0}", end-begin);
        	}
        }
        return null;
    }
    
    @SuppressWarnings("unchecked")
	private String getCfgPropertiesJson(Object conf) {
    	if(conf == null) {
    		return null;
    	}
		JSONObject obj =  null;
		if(conf instanceof CfgProperties) {
			obj = JSONObject.fromObject(new CfgPropertiesJson((CfgProperties)conf));
		} else if(conf instanceof Map) {
			obj = JSONObject.fromObject(new CfgPropertiesJson((Map<String, Object>)conf));
		} else if(conf instanceof CfgPropertiesJson) {
			obj = JSONObject.fromObject(conf);
		}
		if(obj == null) {
			return null;
		} else {
			return obj.toString();
		}
	}
    
    private Properties loadProperties(InputStream is, List<String> invalidList) {
    	Properties prop;
        ByteArrayOutputStream baos = null;
        BufferedReader bf = null;
        InputStreamReader ir = null;
		try {
			prop = new Properties();
			List<String> inValidLineList = new ArrayList<String>();
			baos = CommonUtil.getCopyOutputStream(is);
			is = new ByteArrayInputStream(baos.toByteArray());
			boolean validateResult = propertiesFileValidate(inValidLineList, is);
			if(!validateResult) {
				invalidList.addAll(inValidLineList);
				throw new CfgException(9510,"o2p.configuration.controller.fileInvalid", new String[]{}, null);
			}
			is = new ByteArrayInputStream(baos.toByteArray());
			ir = new InputStreamReader(is,"UTF-8");
			bf = new BufferedReader(ir);
			prop.load(bf);
			return prop;
		} catch (IOException e) {
			throw new CfgException(9510,"o2p.configuration.controller.fileInvalid", new String[]{}, e);
		} finally {
			try {
				if(baos != null) {
					baos.close();
					baos = null;
				}
				if(bf != null) {
					bf.close();
					bf = null;
				}
				if(ir != null) {
					ir.close();
					ir = null;
				}
				if(is != null) {
					is.close();
					is = null;
				}
			} catch(IOException e) {
				log.error("Release resources error", e);
			}
		}
    }
    
    private void syncPropertiesToDb(Set<Map.Entry<String, Object>> entries, String parentPath,
    		List<CfgProperties> cps,Integer zkPathId, Map<String, Object> updateMap, OperateProcess operateProcess) {
    	try {
	        for (Map.Entry<String, Object> entry : entries)
	        {
	            String key = entry.getKey();
	            String value = entry.getValue().toString();
	            if(key != null) {
	            	if(key.charAt(0) == 65279) {
	            		key = key.substring(1);
	            	}
	            	if(key.trim().startsWith("#")) {
	            		continue;
	            	}
	            }
	            StringBuilder path = new StringBuilder();
	            path.append(parentPath).append(separator).append(key);
	            if (log.isDebugEnabled()) {
	                log.debug("getPropertiesSysnToZookeeper path {0}",
	                        path.toString());
	                log.debug("getPropertiesSysnToZookeeper value {0}", key + "-"
	                        + value);
	            }
	            CfgProperties cp = null;
	            if(cps != null && cps.size() > 0) {
	            	for(CfgProperties cfgProperties: cps) {
	            		if(cfgProperties.getKey() != null && cfgProperties.getKey().equals(key)) {
	            			cp = cfgProperties;
	            			break;
	            		}
	            	}
	            }
	            
	            //操作信息
	            Map<String, Object> operatorObj = new HashMap<String, Object>();
	            operatorObj.put("path", path);
	            Map<String, Object> param = new HashMap<String, Object>();
                param.put("proKey", key);
                if(value != null && value.length() > 200) {
                	param.put("proValueBuffer", value);
                } else {
                	param.put("proValue", value);
                }
                param.put("proDataType", "string");
                param.put("proEncrypt", "0");
                param.put("groupName", "default");
                param.put("createDt", new Date());
                param.put("modifyDt", new Date());
                param.put("synStatus", "1");
                param.put("dirId", zkPathId);
	            if(cp == null) {
	                configurationManagementDAO.addConf(param);
	                operatorObj.put("value", param);
	                updateMap.put(key, param);
	            } else {
	            	operatorObj.put("oldValue", cp.clone());
	            	param.put("id", cp.getId());
	            	configurationManagementDAO.updateConf(param);
	            	operatorObj.put("value", param);
	            	updateMap.put(key, param);
	            }
	            if(operateProcess != null) {
	            	operateProcess.getOperatorObjList().add(operatorObj);
	            }
	        }
        } catch(Exception e) {
        	throw new CfgException(9510,"o2p.configuration.controller.syncError", new String[]{}, e);
        }
    }
    
    private void syncPropertiesToZk(Set<Map.Entry<String, Object>> entries, String parentPath, Map<String, Object> updateMap, Integer zkPathId, OperateProcess operateProcess) {
    	try {
	        for (Map.Entry<String, Object> entry : entries) {
	        	String key = entry.getKey();
	            String value = entry.getValue().toString();
	            if(key != null) {
	            	if(key.charAt(0) == 65279) {
	            		key = key.substring(1);
	            	}
	            	if(key.trim().startsWith("#")) {
	            		continue;
	            	}
	            }
//	            if(log.isDebugEnabled()) {
//	            	log.debug("sync properties to zk, key={0}, value={1}", key, value);
//	            }
	            StringBuilder path = new StringBuilder();
	            path.append(parentPath).append(separator).append(key);
	            Object o = getCurator().existsZNode(path.toString());
                if (null == o) {
                    getCurator().createZNode(path.toString(),
                    		getCfgPropertiesJson(updateMap.get(key)));
                } else {
                	getCurator().updateData(path.toString(), getCfgPropertiesJson(updateMap.get(key)));
                }
	        }
	        ZkPath zp = configurationManagementDAO.getZkPath(zkPathId);
	        zp.setDirType(Constant.DIRECTORY_SPEC_PROPERTIES);
	        zp.setDirLastestTime(new Date());
	        configurationManagementDAO.updateZkPath(zp);
        } catch(Exception e) {
        	if(operateProcess != null) {
        		operateProcess.getOperatorObjList().clear();
        	}
        	throw new CfgException(9510,"o2p.configuration.controller.syncError", new String[]{}, e);
        }
    }

	@SuppressWarnings(
    { "unchecked", "rawtypes" })
    @Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
    public void syncPropertiesToZookeeper(OperateProcess operateProcess, InputStream is, Integer zkPathId, List<String> invalidList) throws CfgException {
		Properties prop = loadProperties(is, invalidList);
        Map<String, Object> mapProp = new HashMap<String, Object>((Map) prop);
        ZkPath zkPath = configurationManagementDAO.getZkPath(zkPathId);
        if(zkPath == null) {
        	throw new CfgException(9510,"o2p.configuration.controller.dirNoExist", new String[]{}, null);
        }
        Map<String, Object> confParam = new HashMap<String, Object>();
        confParam.put("dirId", zkPath.getId());
        List<CfgProperties> cps = configurationManagementDAO.getConf(confParam);
        String parentPath = getPathByZKPathId(zkPath.getId());
        Map<String, Object> updateMap = new HashMap<String, Object>();
        Set<Map.Entry<String, Object>> entries = mapProp.entrySet();
        //同步到数据库
        syncPropertiesToDb(entries, parentPath, cps, zkPathId, updateMap, operateProcess);
        //同步到zookeeper
        syncPropertiesToZk(entries, parentPath, updateMap, zkPathId, operateProcess);
    }
	
	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
    public void exportFile(OperateProcess operateProcess, String id,String fileName) throws CfgException {
		Properties prop = new Properties();
    	Map<String, Object> param = new HashMap<String, Object>();
        param.put("id", id.split(","));
    	List<CfgProperties> list = getConfById(param);
    	BufferedWriter out=null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName), "8859_1"));
			//prop.store(out, new String("export.properties".getBytes("UTF-8"), "iso-8859-1"));
			out.write("#" + new String("export.properties".getBytes("UTF-8"), "iso-8859-1"));
			out.newLine();
			out.write("#" + new String(new Date().toString().getBytes("UTF-8"), "iso-8859-1"));
			out.newLine();
			for(CfgProperties cp:list){
				if(cp.getDescription()!=null&&!"".equals(cp.getDescription())){
					out.write("#" + new String(cp.getDescription().getBytes("UTF-8"), "iso-8859-1"));
					out.newLine();
				}
				
	    		if(Constant.NEED_ENCRIYPT.equals(cp.getLock())){
	    			out.write(new String(("SEC.KEY."+cp.getKey()+"="+cp.getValue()).getBytes("UTF-8"), "iso-8859-1"));
	    		}else{
	    			out.write(new String((cp.getKey()+"="+cp.getValue()).getBytes("UTF-8"), "iso-8859-1"));
	    		}
	    		out.newLine();
	    	}
			out.flush();
		} catch (FileNotFoundException e) {
			throw new CfgException(9511,"o2p.configuration.controller.9511", null, e);
		} catch (IOException e) {
			throw new CfgException(9511,"o2p.configuration.controller.9511", null, e);
		}finally {
			try {
				if(out!=null){
					out.close();
				}
			} catch (IOException e) {
				throw new CfgException(9511,"o2p.configuration.controller.9511", null, e);
			}
		}
    }

	private boolean propertiesFileValidate(List<String> invalidLine, InputStream bf) {
		if(bf == null) {
			return false;
		}
		InputStream is = bf;
		BufferedReader br = null;
		InputStreamReader ir = null;
		try {
			ir = new InputStreamReader(is,"UTF-8");
			br = new BufferedReader(ir);
			String line;
			while((line = br.readLine()) != null) {
				line = line.trim();
				if(line.length() > 0 && line.charAt(0) == 65279) {
					line = line.substring(1);
				}
				if(!"".equals(line) && !line.matches("[^\\S]*#[\\s\\S]*") && !line.matches("[\\s\\S]+=[\\s\\S]*")) {
					invalidLine.add(line);
				} else if(line.matches("\\s+\\S*=[\\s\\S]*") || line.matches("=[\\s\\S]*")) {
					invalidLine.add(line);
				}
			}
			return invalidLine.size() == 0;
		} catch(IOException e) {
			log.error("validate inputream error", e);
			return false;
		} finally {
			try {
				if(br != null) {
					br.close();
					br = null;
				}
				if(ir != null) {
					ir.close();
					ir = null;
				}
				is.close();
				is = null;
			} catch (IOException e) {
				log.error("close IO error", e);
			}
		}
	}

	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
    public void deleteConf(OperateProcess operateProcess, String id) {
    	try {
	        Map<String, Object> param = new HashMap<String, Object>();
	        param.put("id", id.split(","));
	        List<CfgProperties> list = configurationManagementDAO.getConfById(param);
	        for (CfgProperties conf : list)
	        {
	        	String path = this.getPathByZKPathId(conf.getDirId());
	        	String fullPath = path+separator+conf.getKey();
	            log.info("delete conf to zookeeper path {0}", fullPath);
	            Object o = getCurator().existsZNode(fullPath);
	            if (null != o)
	            {
	                getCurator().deleteZNode(fullPath);
	            }
	            if(operateProcess != null) {
	            	Map<String, Object> operatorObj = new HashMap<String, Object>();
                    operatorObj.put("path", fullPath);
                    operatorObj.put("data", conf);
                    operateProcess.getOperatorObjList().add(operatorObj);
	            }
	        }
	        configurationManagementDAO.deleteConfById(param);
    	} catch (KeeperException e) {
            throw new CfgException(9502,"o2p.configuration.controller.9502", null, e);
        } catch (InterruptedException e) {
            throw new CfgException(9503,"o2p.configuration.controller.9503", null, e);
        } catch (Exception e) {
            throw new CfgException(9504,"o2p.configuration.controller.9504", null, e);
        }
    }
    
    @Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void deleteZkpath(OperateProcess operateProcess, String id) {
		try {
			ZkPath path = configurationManagementDAO.getZkPath(Integer.valueOf(id));
			if(path != null) {
				String zkPath = getPathByZKPathId(Integer.valueOf(id));
				recursionDelete(operateProcess, path);
				if(getCurator().existsZNode(zkPath) != null) {
					getCurator().deletingChildrenIfNeededZNode(zkPath);
				}
			}
		} catch(Exception e) {
			throw new CfgException(9507, "o2p.configuration.controller.9507", null, e);
		}
	}
	
	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void recursionDelete(OperateProcess operateProcess, ZkPath path) throws Exception {
		if(path.getChildren() != null) {
			for(ZkPath child: path.getChildren()) {
				recursionDelete(operateProcess, child);
			}
		}
		if(operateProcess != null) {
        	Map<String, Object> operatorObj = new HashMap<String, Object>();
            operatorObj.put("path", getPathByZKPathId(path.getId()));
            operatorObj.put("data", path);
            operateProcess.getOperatorObjList().add(operatorObj);
        }
		configurationManagementDAO.deleteZkpathById(path.getId());
		configurationManagementDAO.deleteConfByZkpathId(path.getId());
	}
	
	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public String getPathByZKPathId(Integer id) {
		StringBuilder sb = new StringBuilder();
		sb.append(separator);
		ZkPath path = configurationManagementDAO.getZkPath(id);
		if(path == null) {
			return null;
		}
		sb.append(path.getText());
		while(path.getpId() != 0) {
			path = configurationManagementDAO.getZkPath(path.getpId());
			sb.insert(0, separator+path.getText());
		}
		return sb.toString().replaceFirst("/[^/]*/", "/");
	}

	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void createZkPath(OperateProcess operateProcess, Integer parentId, String dirType, String dirName) {
		try {
			ZkPath zkPath = new ZkPath();
			zkPath.setpId(parentId);
			zkPath.setText(dirName);
			zkPath.setDirType(Integer.parseInt(dirType));
			zkPath.setDirCreateTime(new Date());
			zkPath.setDirLastestTime(new Date());
			List<ZkPath> zkPaths = configurationManagementDAO.getZkPath(new HashMap<String, Object>());
			String path = getPathByZKPathId(parentId)+separator+dirName;
			//检查命名空间下是否存在该目录
			if(zkPaths != null) {
				for(ZkPath zkNameSpacePath: zkPaths) {
					String p = getPathByZKPathId(zkNameSpacePath.getId());
					if(path.equals(p)) {
						throw new CfgException(9504, "o2p.configuration.controller.dirExist", new String[]{}, null);
					}
				}
			}
			configurationManagementDAO.createZkPath(zkPath);
			if(getCurator().existsZNode(path) == null) {
				getCurator().createZNode(path, zkPath.getText());
			}
			if(operateProcess != null) {
	        	Map<String, Object> operatorObj = new HashMap<String, Object>();
	            operatorObj.put("path", path);
	            operatorObj.put("data", zkPath);
	            operateProcess.getOperatorObjList().add(operatorObj);
	        }
		} catch (CfgException e) {
			throw e;
		} catch(Exception e) {
			throw new CfgException(9504, "o2p.configuration.controller.9504", null, e);
		}
	}
	
	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void updateZkPath(OperateProcess operateProcess,Integer dirId, String dirType, String dirName)  {
		ZkPath zkPath = new ZkPath();
		zkPath.setId(dirId);
		zkPath.setText(dirName);
		zkPath.setDirType(Integer.parseInt(dirType));
		zkPath.setDirLastestTime(new Date());
		if(Constant.DIRECTORY_SPEC_NON_PROPERTIES == zkPath.getDirType()) {
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("dirId", dirId);
			List<CfgProperties> cpList = configurationManagementDAO.getConf(params);
			if(cpList.size() > 0) {
				throw new CfgException(9508, 
						"o2p.configuration.controller.dirUpdateConfExist",
						new String[]{dirName}, 
						null);
			}
		}
		try {
			configurationManagementDAO.updateZkPath(zkPath);
			String path = getPathByZKPathId(zkPath.getId());
			
			getCurator().updateData(path, zkPath.getText());
			
			if(operateProcess != null) {
	        	Map<String, Object> operatorObj = new HashMap<String, Object>();
	            operatorObj.put("path", path);
	            operatorObj.put("data", zkPath);
	            operateProcess.getOperatorObjList().add(operatorObj);
	        }
		} catch(Exception e) {
			throw new CfgException(9508, "o2p.configuration.controller.9508",null,e);
		}
	}

	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public String createProp(OperateProcess operateProcess,CfgProperties addCp) {
		try
        {
        	StringBuilder path = new StringBuilder(getPathByZKPathId(Integer.valueOf(addCp.getDirId())));
            String newPath = path.append(separator + addCp.getKey()).toString();
            
            //判断属性是否存在
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("dirId", addCp.getDirId());
            map.put("proKey", addCp.getKey());
            List<CfgProperties> cpList=configurationManagementDAO.getConf(map);
            if(cpList!=null&&cpList.size()>0){
            	return MessageSourceUtils.getMessage("o2p.configuration.controller.confKeyExist", new String[]{newPath});
            }
            
            // 同步数据库
            map.put("proDataType", addCp.getProDataType());
            String value = null;
            if (Constant.NON_NEED_ENCRIYPT.equals(addCp.getLock())) {
            	value = addCp.getValue();
                map.put("proEncrypt", "0");
            } else {
            	value = SecurityUtil.getInstance().encryMsg(addCp.getValue());
                map.put("proEncrypt", "1");
            }
            if(value !=null && value.length() > 200) {
            	map.put("proValueBuffer", value);
            	addCp.setProValueBuffer(value);
            	addCp.setValue(null);
            } else {
            	map.put("proValue", value);
            	addCp.setValue(value);
            }
            // map.put("proType", "");
            map.put("groupName", addCp.getGroup());
            // map.put("groupDesc", "");
            map.put("createDt", new Date());
            map.put("synStatus", "1");
            map.put("description", addCp.getDescription());
            map.put("proConstraint", addCp.getProConstraint());
            configurationManagementDAO.addConf(map);
            
            //同步zookeeper
            Stat stat = getCurator().existsZNode(newPath);
            if (null != stat){	
            	getCurator().updateData(newPath, getCfgPropertiesJson(addCp));
            }else{
            	getCurator().createZNode(newPath, getCfgPropertiesJson(addCp));
            }
            
            if(operateProcess != null) {
	        	Map<String, Object> operatorObj = new HashMap<String, Object>();
	            operatorObj.put("path", newPath);
	            operatorObj.put("data", map);
	            operateProcess.getOperatorObjList().add(operatorObj);
	        }

        }
        catch (KeeperException e)
        {
            throw new CfgException(9502,
                    "o2p.configuration.controller.9502", null, e);
        }
        catch (InterruptedException e)
        {
            throw new CfgException(9503,
                    "o2p.configuration.controller.9503", null, e);
        }
        catch (Exception e)
        {
            throw new CfgException(9504,
                    "o2p.configuration.controller.9504", null, e);
        }
		return null;
	}

	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void updateConf(OperateProcess operateProcess,List<CfgProperties> cpList) {
		Object o;
		try {
			if(cpList == null) {
				return;
			}
			String path = null;
			Map<String, Object> params = new HashMap<String, Object>();
			for(CfgProperties cp: cpList) {
				if(cp == null) {
					continue;
				}
				if(path == null) {
					path = getPathByZKPathId(cp.getDirId());
				}
				if(operateProcess != null) {
		        	Map<String, Object> operatorObj = new HashMap<String, Object>();
		            operatorObj.put("path", path);
		            params.put("id", new Integer[]{cp.getId()});
		            operatorObj.put("oldConf", configurationManagementDAO.getConfById(params));
		            operatorObj.put("newConf", cp);
		            operateProcess.getOperatorObjList().add(operatorObj);
		        }
				configurationManagementDAO.updateConf(cp);
			}
			String fullPath = null;
			for(CfgProperties cp: cpList) {
				if(cp == null) {
					continue;
				}
				fullPath = path + ConfigurationManagementService.separator + cp.getKey();
				o = getCurator().existsZNode(fullPath);
		        if (null != o){
		            getCurator().updateData(fullPath, getCfgPropertiesJson(cp));
		        } else {
		            getCurator().createZNode( fullPath, getCfgPropertiesJson(cp));
		        }
			}
		} catch (KeeperException e) {
            throw new CfgException(9502,"o2p.configuration.controller.9502", null, e);
        } catch (InterruptedException e) {
            throw new CfgException(9503,"o2p.configuration.controller.9503", null, e);
        } catch (Exception e) {
            throw new CfgException(9504,"o2p.configuration.controller.9504", null, e);
        }
	}

	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void copyOldConfToNewConf(OperateProcess operateProcess,Map<String, Object> param, ZkPath zkpath) {
		List<CfgProperties> confList = configurationManagementDAO.getConfById(param);
        try
        {
        	StringBuilder path = new StringBuilder(getPathByZKPathId(zkpath.getId()));
        	if(log.isDebugEnabled() && confList != null) {
        		log.debug("copy properties to {0}, size: {1}", path.toString(), confList.size());
        	}
        	if(confList == null) {
        		if(log.isDebugEnabled()) {
        			log.debug("copy properties List is null");
        		}
        		return;
        	}
        	String oldPath = null;
	        for (CfgProperties conf : confList)
	        {
	        	if(oldPath == null) {
	        		oldPath = getPathByZKPathId(conf.getDirId());
	        	}
                String newPath = path.toString() + separator + conf.getKey();
                // 同步数据库
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("proKey", conf.getKey());
                map.put("proDataType", conf.getProDataType());
                map.put("proValue", conf.getValue());
                map.put("proValueBuffer", conf.getProValueBuffer());
                map.put("proType", conf.getProType());
                map.put("proEncrypt", conf.getLock());
                map.put("groupName", conf.getGroup());
                map.put("groupDesc", conf.getGroupDesc());
                map.put("createDt", new Date());
                map.put("synStatus", "1");
                map.put("description", conf.getDescription());
                map.put("proConstraint", conf.getProConstraint());
                map.put("dirId", zkpath.getId());

                Map<String,Object> findMap = new HashMap<String, Object>();
                findMap.put("proKey", conf.getKey());
                findMap.put("dirId", zkpath.getId());
                List<CfgProperties> oList = configurationManagementDAO.getConf(findMap);
                if (oList == null || oList.isEmpty())
                {
                	configurationManagementDAO.addConf(map);
                	if(operateProcess != null) {
        	        	Map<String, Object> operatorObj = new HashMap<String, Object>();
        	            operatorObj.put("newPath", newPath);
        	            operatorObj.put("oldPath", oldPath + separator + conf.getKey());
        	            operatorObj.put("data", map);
        	            operateProcess.getOperatorObjList().add(operatorObj);
        	        }
                }
                else
                {
                	map.put("id", oList.get(0).getId());
                	configurationManagementDAO.updateConf(map);
                	if(operateProcess != null) {
        	        	Map<String, Object> operatorObj = new HashMap<String, Object>();
        	            operatorObj.put("newPath", newPath);
        	            operatorObj.put("oldPath", oldPath);
        	            operatorObj.put("oldConf", oList.get(0));
        	            operatorObj.put("newConf", map);
        	            operateProcess.getOperatorObjList().add(operatorObj);
        	        }
                }
                
                Stat stat = getCurator().existsZNode(newPath);
                // 同步zookeeper
                if (null == stat) {
                    getCurator().createZNode(newPath, getCfgPropertiesJson(conf));
                }
                else {
                    getCurator().updateData(newPath, getCfgPropertiesJson(conf));
                }
            }
        } catch (KeeperException e)
        {
            throw new CfgException(9502,
                    "o2p.configuration.controller.9502", null, e);
        }
        catch (InterruptedException e)
        {
            throw new CfgException(9503,
                    "o2p.configuration.controller.9503", null, e);
        }
        catch (Exception e)
        {
            throw new CfgException(9504,
                    "o2p.configuration.controller.9504", null, e);
        }
	}
	
	public List<CfgProperties> getConf(String path, String proKey) {
        if (log.isDebugEnabled())
        {
            log.debug("getConf path {0}", path);
            log.debug("getConf prokey {0}", proKey);
        }
        return configurationManagementDAO.getConf(path, proKey);
    }
    
    public List<CfgProperties> getConfById(Map<String, Object> param) {
        return configurationManagementDAO.getConfById(param);
    }
    
    public List<ZkPath> getZkPath() {
        return configurationManagementDAO.getZkPath();
    }
    
    public List<CfgProperties> getConf(Map<String, Object> param) {
    	List<CfgProperties> list=configurationManagementDAO.getConf(param);
    	Map<String, Object> ZKValueMap = new HashMap<String, Object>();
		try {
			String treePath = getPathByZKPathId(Integer.parseInt(param.get("dirId").toString()));
			Object obj = getCurator().existsZNode(treePath);
			if (null != obj) {
				List<Map<String, Object>> ZKValueList = (List<Map<String, Object>>) getCurator().getData(treePath);
				for (Map<String, Object> ZKValue : ZKValueList) {
					for (Map.Entry ZKMap : ZKValue.entrySet()) {
						Map tempZKMap = (Map) JSONObject.toBean(JSONObject.fromObject(ZKMap.getValue()),
								HashMap.class);
						ZKValueMap.put(String.valueOf(tempZKMap.get("key")), tempZKMap.get("value"));
					}
				}
			}
		} catch (Exception e) {
		}
		Object ZKValueString = null;
		for (CfgProperties cp : list) {
			ZKValueString = ZKValueMap.get(cp.getKey());
			if (ZKValueString != null) {
				if (!String.valueOf(ZKValueString).equals(cp.getValue())) {
					cp.setState("2");//ZK上的值与数据库的值不一致
					cp.setError(String.valueOf(ZKValueString));
				}
			} else {
				cp.setState("3");//ZK无该属性
			}
		}
        return list;
    }
    
    public List<ZkPath> getZkPathById(Map<String, Object> param) {
        return configurationManagementDAO.getZkPathById(param);
    }
    
    public List<ZkPath> getParentZkPathById(Map<String, Object> param) {
        return configurationManagementDAO.getParentZkPathById(param);
    }
	
	public Curator getCurator() {
		if(curator == null) {
			curator = new Curator();
		}
        return curator;
    }

    public void setCurator(Curator curator) {
        this.curator = curator;
    }

	public List<Map<String, Object>> checkConfExist(String ids, int namespaceId) {
		if(!StringUtils.hasText(ids)) {
			return new ArrayList<Map<String, Object>>();
		}
		return configurationManagementDAO.checkKeyExistBySrcId(ids, namespaceId);
	}
}
