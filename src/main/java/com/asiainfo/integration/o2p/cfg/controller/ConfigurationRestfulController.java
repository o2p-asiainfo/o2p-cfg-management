/** 
 * Project Name:o2p-configuration-management 
 * File Name:ConfigurationRestfulController.java 
 * Package Name:com.asiainfo.eaap.integration.controller 
 * Date:2015年9月2日上午9:44:28 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.cfg.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.ailk.eaap.o2p.common.security.SecurityUtil;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.foundation.util.MessageSourceUtils;
import com.asiainfo.integration.o2p.cfg.dto.CfgProperties;
import com.asiainfo.integration.o2p.cfg.dto.OperateProcess;
import com.asiainfo.integration.o2p.cfg.dto.ZkPath;
import com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService;
import com.asiainfo.integration.o2p.cfg.util.CfgException;
import com.asiainfo.integration.o2p.cfg.util.Constant;
import com.asiainfo.integration.o2p.web.util.WebConstants;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class ConfigurationRestfulController
{
    private static final Logger log = Logger
            .getLog(ConfigurationRestfulController.class);
    @Autowired
    ConfigurationManagementService configurationManagementService;

    @RequestMapping(value = "/rest/configuration/prop/add", method = RequestMethod.POST)
    public String createProp(HttpServletRequest request, CfgProperties cp, HttpServletResponse response)
    {
    	try {
    		OperateProcess op = new OperateProcess();
    		op.setRequest(request);
	        String result = configurationManagementService.createProp(op, cp);
	        if(result != null) {
	        	return result;
	        }
    	} catch(CfgException e) {
    		return e.getResult().getMsg();
    	}
        return "success";
    }

    @RequestMapping(value = "/rest/configuration/tree", method = RequestMethod.POST)
    public List<ZkPath> getZkPathTree()
    {
        if (log.isDebugEnabled())
        {
            log.debug("tree");
        }
        return configurationManagementService.getZkPath();
    }
    
    @RequestMapping(value = "/rest/configuration/import/{id}", method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
	public String importAction(@PathVariable Integer id, HttpServletRequest request) throws IOException {
    	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
    	MultipartFile file = multipartRequest.getFile("fileToUpload");
    	InputStream si = file.getInputStream();
    	if(si == null) {
    		return MessageSourceUtils.getMessage("o2p.configuration.controller.filenull", null);
    	}
    	if(id == null) {
    		return MessageSourceUtils.getMessage("o2p.configuration.controller.dirInvalid", null);
    	}
    	if(!file.getOriginalFilename().endsWith("properties")) {
    		return MessageSourceUtils.getMessage("o2p.configuration.controller.fileInvalid", null);
    	}
    	//check size
		if(file.getSize()>10485760){
			return MessageSourceUtils.getMessage("o2p.configuration.controller.fileExceed", new Object[]{Long.valueOf(file.getSize())});
		}
    	OperateProcess op = new OperateProcess();
    	op.setRequest(request);
    	List<String> invalidLine = new ArrayList<String>();
    	JSONObject result = new JSONObject();
    	result.put("result", "success");
    	try {
			configurationManagementService.syncPropertiesToZookeeper(op, si, id, invalidLine);
		} catch (CfgException e) {
			log.error("import file error", e);
			result.put("result", "fault");
			result.put("msg", e.getResult().getMsg());
			result.put("info", invalidLine);
		} catch (Exception e) {
			log.error("import file error", e);
			result.put("result", "fault");
			result.put("msg", new CfgException(9510,"o2p.configuration.controller.9510", null, e).getResult().getMsg());
		}
    	return result.toString();
    }
    
    @RequestMapping(value = "/rest/configuration/export/{id}", method = RequestMethod.POST)
    @ResponseBody
    public String exportPreparationAction(HttpServletRequest request, HttpServletResponse response, @PathVariable String id) throws IOException
    {	
		try {
			File dir=new File(request.getRealPath("/")+"export/");
			if(!dir.exists()){
				dir.mkdirs();
			}
			String fileName = dir.getPath()+"/"+UUID.randomUUID()+".properties";
    		OperateProcess op = new OperateProcess();
    		op.setRequest(request);
	        configurationManagementService.exportFile(op, id,fileName);
	        request.getSession().setAttribute("ConfigurationRestfulController.exportFileName", fileName);
	        return "success";
    	} catch(CfgException e) {
    		return e.getResult().getMsg();
    	}
    }
    
    @RequestMapping(value = "/rest/configuration/export", method = RequestMethod.POST)
    public ResponseEntity<byte[]> exportAction(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
		File file=new File((String)request.getSession().getAttribute("ConfigurationRestfulController.exportFileName"));
		String fileName = new String("export.properties".getBytes("UTF-8"), "iso-8859-1"); 
		HttpHeaders headers = new HttpHeaders(); 
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM); 
		headers.setContentDispositionFormData("attachment", fileName);
		byte[] fileByte=FileUtils.readFileToByteArray(file);
		file.delete();
		return new ResponseEntity(fileByte, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/rest/configuration/conf/{id}", method = RequestMethod.GET)
    public String getConfById(@PathVariable int id)
    {
        JSONObject json = new JSONObject();
        if (0 == id) {
            json.put("data", "[]");
            return json.toString();
        }
        Map<String, Object> zParam = new HashMap<String, Object>();
        zParam.put("id", id);
        List<ZkPath> zList = configurationManagementService.getZkPathById(zParam);
        if(zList.size() > 0) {
	        Map<String, Object> param = new HashMap<String, Object>();
	        param.put("dirId", id);
	        List<CfgProperties> list = configurationManagementService
	                .getConf(param);
	        json.put("data", list);
	        if (list != null && list.size() > 0)
	        {
	            json.put("length", list.size());
	        }
	        return json.toString();
        } else {
        	json.put("data", "[]");
            return json.toString();
        }
        
    }
    
    @RequestMapping(value = "/rest/configuration/delete/zkpath/{id}", method = RequestMethod.DELETE)
    public String deleteZkpathById(HttpServletRequest request, @PathVariable String id)
    {
    	if(log.isDebugEnabled()) {
    		log.debug("delete zk path, id:{0}", id);
    	}
        try {
        	OperateProcess op = new OperateProcess();
    		op.setRequest(request);
			configurationManagementService.deleteZkpath(op, id);
		} catch (CfgException e) {
			log.error("deleteZkpathById error", e);
			return e.getResult().getMsg();
		}
        return "success";
    }
    
    @RequestMapping(value = "/rest/configuration/add/zkpath/{parentId}/{dirType}/{dirName}", method = RequestMethod.PUT)
    public String createZkpath(HttpServletRequest request, @PathVariable
    Integer parentId,@PathVariable String dirType,@PathVariable String dirName) {
    	if(log.isDebugEnabled()) {
    		log.debug("create zkpath parentId:{0}, dirType:{1}, dirName:{2} ", parentId, dirType, dirName);
    	}
        try {
        	OperateProcess op = new OperateProcess();
    		op.setRequest(request);
			configurationManagementService.createZkPath(op, parentId, dirType, dirName);
		} catch (CfgException e) {
			log.error("createZkpath error", e);
			return e.getResult().getMsg();
		}
        return "success";
    }
    
    @RequestMapping(value = "/rest/configuration/edit/zkpath/{dirId}/{dirType}/{dirName}", method = RequestMethod.POST)
    public String updateZkpath(HttpServletRequest request, @PathVariable
    Integer dirId,@PathVariable String dirType,@PathVariable String dirName)
    {
    	if(log.isDebugEnabled()) {
    		log.debug("update zkpath dirId:{0}, dirType:{1}, dirName:{2} ", dirId, dirType, dirName);
    	}
        try {
        	OperateProcess op = new OperateProcess();
    		op.setRequest(request);
			configurationManagementService.updateZkPath(op, dirId, dirType, dirName);
		} catch(CfgException e) {
			log.error("updateZkpath error", e);
			return e.getResult().getMsg();
		}
        return "success";
    }

    @RequestMapping(value = "/rest/configuration/delete/conf/{id}", method = RequestMethod.DELETE)
    public String deleteConfById(HttpServletRequest request, @PathVariable String id)
    {
    	if(log.isDebugEnabled()) {
    		log.debug("udeleteConfById id:{0}", id);
    	}
    	try {
    		OperateProcess op = new OperateProcess();
    		op.setRequest(request);
    		configurationManagementService.deleteConf(op, id);
    	} catch(CfgException e) {
    		log.error("deleteConfById error", e);
    		return e.getResult().getMsg();
    	}
        return "success";
    }

    @RequestMapping(value = "/rest/configuration/conf/", method = RequestMethod.POST)
    @ResponseBody
    public String updateConf(@RequestParam("data") String dataArray, HttpServletRequest request, HttpServletResponse response) {
    	if(dataArray == null) {
    		return "success";
    	}
    	JSONArray array = JSONArray.fromObject(dataArray);
    	List<CfgProperties> cpList = new ArrayList<CfgProperties>();
    	for(int i=0; i<array.size(); i++) {
    		JSONObject obj = array.getJSONObject(i);
    		CfgProperties cp = (CfgProperties) JSONObject.toBean(obj, CfgProperties.class);
    		cp.setModifyDt(new Date());
    		cp.setSynStatus("1");
    		Map<String, Object> param = new HashMap<String, Object>();
	        int[] ids = { cp.getId() };
	        param.put("id", ids);
	        List<CfgProperties> list = configurationManagementService.getConfById(param);
	        if(list.size() > 0) {
	        	CfgProperties conf = list.get(0);
	        	String encryValue = null;
	        	if(log.isDebugEnabled()) {
	        		log.debug("update conf value {0} oldValue {1} old conf isLock {2}", cp.getValue(), conf.getValue(), conf.getLock());
	        	}
	        	if (Constant.NEED_ENCRIYPT.equals(cp.getLock()))
	            {
	        		if(cp.getValue()!=null && cp.getValue().equals(conf.getValue()) && Constant.NEED_ENCRIYPT.equals(conf.getLock())) {
	        			encryValue = cp.getValue();
	        		} else {
	        			encryValue = SecurityUtil.getInstance().encryMsg(cp.getValue());
	        			if(encryValue != null && encryValue.equals(cp.getValue())) {
        					log.warn("conf key {0} need encrypt but maybe isEncrypt is configured false", cp.getKey());
	        				cp.setLock(Constant.NON_NEED_ENCRIYPT);
	        			}
	        		}
	            } else if(cp.getLock() == Constant.NON_NEED_ENCRIYPT) {
	            	encryValue = cp.getValue();
	            }
	        	if(encryValue != null && encryValue.length() > 200) {
	        		cp.setProValueBuffer(encryValue);
	        		cp.setValue("");
	        	} else {
	        		cp.setProValueBuffer("");
	        		cp.setValue(encryValue);
	        	}
	        }
	        cpList.add(cp);
    	}
    	OperateProcess op = new OperateProcess();
    	op.setRequest(request);
    	if(log.isDebugEnabled()) {
    		log.debug("user info is {0}", op.getRequest().getSession().getAttribute(WebConstants.O2P_SSO_USER_SESSION_KEY));
    	}
    	configurationManagementService.updateConf(op, cpList);
    	return "success";
    }
    
    @RequestMapping(value = "/rest/configuration/check/conf/{namespaceId}/{ids}", method = RequestMethod.POST)
    public List<Map<String, Object>> checkConfExist(@PathVariable String ids, @PathVariable int namespaceId) {
    	if(log.isDebugEnabled()) {
    		log.debug("checkExists ids:{0},namespaceId{1}", ids,namespaceId);
    	}
    	List<Map<String, Object>> existIds = configurationManagementService.checkConfExist(ids, namespaceId);
    	if(existIds == null) {
    		return new ArrayList<Map<String, Object>>();
    	} else {
    		return existIds;
    	}
    }

    @RequestMapping(value = "/rest/configuration/copy/{namespaceId}/{ids}", method = RequestMethod.POST)
    public String copyOldConfToNewConf(HttpServletRequest request, @PathVariable String ids, @PathVariable int namespaceId) {
    	if(log.isDebugEnabled()) {
    		log.debug("copyOldConfToNewConf ids:{0},namespaceId{1}", ids,namespaceId);
    	}
        Map<String, Object> zkparam = new HashMap<String, Object>();
        zkparam.put("id", namespaceId);
        List<ZkPath> zkList = configurationManagementService.getParentZkPathById(zkparam);
        if(zkList != null && zkList.size() > 0) {
	        ZkPath zkpath = zkList.get(0);
	        Map<String, Object> param = new HashMap<String, Object>();
	        param.put("id", ids.split(","));
	        try {
	        	OperateProcess op = new OperateProcess();
	    		op.setRequest(request);
	        	configurationManagementService.copyOldConfToNewConf(op, param, zkpath);
	        } catch(CfgException e) {
	        	log.error("copyOldConfToNewConf error", e);
	        	return e.getResult().getMsg();
	        }
        }
        return "success";
    }
    
    
}
