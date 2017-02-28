package com.asiainfo.integration.o2p.cfg.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.ailk.eaap.o2p.sqllog.model.OperateLog;
import com.ailk.eaap.o2p.sqllog.model.OperateLogData;

@Repository("operatorLogDao")
public class OperatorLogDao {

	@Resource(name="configurationSqlSession")
	private SqlSessionTemplate sqlSessionTemplate;
    public static final String OPERATORLOG = "operatorLog.";
    
    public void insertOperateLog(OperateLog operateLog) {
    	sqlSessionTemplate.insert(OPERATORLOG + "insertOperateLog", operateLog);
    }
    
    public void insertOperateLogData(OperateLogData operateLogData) {
    	sqlSessionTemplate.insert(OPERATORLOG + "insertOperateLogData", operateLogData);
    }
}
