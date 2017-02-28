package com.asiainfo.integration.o2p.cfg.dto;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class OperateProcess {
	private List<Object> operatorObjList = new ArrayList<Object>();
	private HttpServletRequest request;

	public List<Object> getOperatorObjList() {
		return operatorObjList;
	}

	public void setOperatorObjList(List<Object> operatorObjList) {
		this.operatorObjList = operatorObjList;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
}
