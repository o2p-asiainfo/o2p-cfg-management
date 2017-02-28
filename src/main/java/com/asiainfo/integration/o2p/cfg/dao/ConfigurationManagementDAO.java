/** 
 * Project Name:o2p-configuration-management 
 * File Name:ConfigurationManagementDAO.java 
 * Package Name:com.asiainfo.eaap.integration.dao 
 * Date:2015年8月28日下午5:38:58 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.cfg.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.mybatis.spring.SqlSessionTemplate;

import com.asiainfo.integration.o2p.cfg.dto.CfgProperties;
import com.asiainfo.integration.o2p.cfg.dto.ZkPath;

public class ConfigurationManagementDAO
{
    private SqlSessionTemplate sqlSessionTemplate;
    public static final String CONFIGURATION_MANAGEMENT = "configurationManagement.";

    public SqlSessionTemplate getSqlSessionTemplate()
    {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate)
    {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<CfgProperties> getConf()
    {
        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "allConf");
    }

    public List<CfgProperties> getConf(String effectZone, String moduleName,
            String proKey)
    {
        Map<String, Object> param = new HashMap<String, Object>();
        param.put("proKey", proKey);
        param.put("moduleName", moduleName);
        param.put("effectZone", effectZone);

        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectConf", param);
    }
    
    public List<CfgProperties> getConf(String proKey) {
    	return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectConfBykey", proKey);
    }

    public List<CfgProperties> getConf(String path, String proKey)
    {
        Map<String, Object> param = new HashMap<String, Object>();
        if (!StringUtils.isEmpty(path))
        {
            String[] strs = path.split("/");
            if (strs.length >= 2)
            {
                int length = strs.length;
                param.put("moduleName", strs[length - 1]);
                param.put("effectZone", strs[length - 2]);
            }
        }

        if (null != proKey)
        {
            param.put("proKey", proKey);
        }
        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectConf", param);
    }

    public List<CfgProperties> getConf(Map<String, Object> param)
    {
        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectConf", param);
    }

    public List<CfgProperties> getConfById(Map<String, Object> param)
    {
        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectConfById", param);
    }

    public int addConf(Map<String, Object> param)
    {
        return sqlSessionTemplate.insert(CONFIGURATION_MANAGEMENT
                + "ADD_CONFIGURATION_MANAGER", param);
    }

    public int updateConf(Map<String, Object> map)
    {
        return sqlSessionTemplate.update(CONFIGURATION_MANAGEMENT
                + "UPDATE_CONFIGURATION_MANAGEMENT", map);
    }
    
    public int updateConf(CfgProperties cp)
    {
        return sqlSessionTemplate.update(CONFIGURATION_MANAGEMENT
                + "update_conf_properties", cp);
    }

    public int deleteConf(Map<String, Object> param)
    {
        return sqlSessionTemplate.delete(CONFIGURATION_MANAGEMENT
                + "DELETE_CONFIGURATION_MANAGEMENT", param);
    }

    public int deleteConfById(Map<String, Object> param)
    {
        return sqlSessionTemplate.delete(CONFIGURATION_MANAGEMENT
                + "deleteConfById", param);
    }

    public List<ZkPath> getZkPath()
    {
        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "allZkPath");
    }
    
    public List<ZkPath> getZkPath(Map<String, Object> param) {
    	return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectSinZkPath", param);
    }

    public List<ZkPath> getZkPathById(Map<String, Object> param)
    {
        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectZkPathById", param);
    }

    public List<ZkPath> getParentZkPathById(Map<String, Object> param)
    {
        return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "selectParentZkPathById", param);
    }
	
	public ZkPath getZkPath(Integer id) {
		return sqlSessionTemplate.selectOne(CONFIGURATION_MANAGEMENT
                + "selectZkPath", id);
	}

	public void deleteZkpathById(int id) {
		sqlSessionTemplate.delete(CONFIGURATION_MANAGEMENT
                + "deleteZkpathById", id);
	}

	public void deleteConfByZkpathId(Integer id) {
		sqlSessionTemplate.delete(CONFIGURATION_MANAGEMENT
                + "deleteConfByZkpathId", id);
	}

	public void createZkPath(ZkPath zkPath) {
		sqlSessionTemplate.insert(CONFIGURATION_MANAGEMENT
                + "createZkPath", zkPath);
	}
	
	public void updateZkPath(ZkPath zkPath) {
		sqlSessionTemplate.update(CONFIGURATION_MANAGEMENT
                + "updateZkPath", zkPath);
	}

	public List<Map<String, Object>> checkKeyExistBySrcId(String ids, int namespaceId) {
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ids", ids.split(","));
		params.put("namespaceId", namespaceId);
		return sqlSessionTemplate.selectList(CONFIGURATION_MANAGEMENT
                + "checkKeyExistBySrcId", params);
	}
}
