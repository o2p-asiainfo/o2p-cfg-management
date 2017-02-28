package com.asiainfo.integration.o2p.cfg.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ailk.eaap.o2p.sqllog.model.OperateLog;
import com.ailk.eaap.o2p.sqllog.model.OperateLogData;
import com.asiainfo.integration.o2p.cfg.dao.OperatorLogDao;

@Repository("operatorLogService")
@Transactional
public class OperatorLogService {
	@Resource(name="operatorLogDao")
	private OperatorLogDao operatorLogDao;
	
	@Transactional(rollbackFor=Exception.class, propagation=Propagation.REQUIRED)
	public void recordOperateLog(OperateLog log) {
		operatorLogDao.insertOperateLog(log);
		if(log.getLogDataList() != null && !log.getLogDataList().isEmpty()) {
			for(OperateLogData data: log.getLogDataList()) {
				data.setLogId(log.getLogId());
				operatorLogDao.insertOperateLogData(data);
			}
		}
	}

	public void setOperatorLogDao(OperatorLogDao operatorLogDao) {
		this.operatorLogDao = operatorLogDao;
	}
}
