package com.asiainfo.integration.o2p.cfg.dto;

import java.io.Serializable;
import java.util.Map;

public class CfgPropertiesJson implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String key;
    private String proDataType;
    private String value;
    private String proValueBuffer;
    private String proType;
    private Integer lock;
    private String proConstraint;
    private String description;
    
    public CfgPropertiesJson(CfgProperties cp) {
    	this.setKey(cp.getKey());
    	this.setProDataType(cp.getProDataType());
    	this.setValue(cp.getValue());
    	this.setProValueBuffer(cp.getProValueBuffer());
    	this.setLock(cp.getLock());
    	this.setProConstraint(cp.getProConstraint());
    	this.setProType(cp.getProType());
    	this.setDescription(cp.getDescription());
    }
    
    public CfgPropertiesJson(Map<String, Object> cp) {
    	this.setKey((String)cp.get("proKey"));
    	this.setProDataType((String)cp.get("proDataType"));
    	this.setValue((String)cp.get("proValue"));
    	this.setProValueBuffer((String)cp.get("proValueBuffer"));
    	if(cp.get("proEncrypt") instanceof Integer) {
    		this.setLock((Integer)cp.get("proEncrypt"));
    	} else if(cp.get("proEncrypt") instanceof String) {
    		this.setLock(Integer.valueOf((String)cp.get("proEncrypt")));
    	}
    	this.setProConstraint((String)cp.get("proConstraint"));
    	this.setDescription((String)cp.get("description"));
    	this.setProType((String)cp.get("proType"));
    }
    
	public String getKey() {
		return key;
	}
	public final void setKey(String key) {
		this.key = key;
	}
	public String getProDataType() {
		return proDataType;
	}
	public final void setProDataType(String proDataType) {
		this.proDataType = proDataType;
	}
	public String getValue() {
		return value;
	}
	public final void setValue(String value) {
		this.value = value;
	}
	public String getProValueBuffer() {
		return proValueBuffer;
	}
	public final void setProValueBuffer(String proValueBuffer) {
		this.proValueBuffer = proValueBuffer;
	}
	public String getProType() {
		return proType;
	}
	public final void setProType(String proType) {
		this.proType = proType;
	}
	public int getLock() {
		return lock;
	}
	public final void setLock(int lock) {
		this.lock = lock;
	}
	public String getProConstraint() {
		return proConstraint;
	}
	public final void setProConstraint(String proConstraint) {
		this.proConstraint = proConstraint;
	}
	public String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	public final void setLock(Integer lock) {
		this.lock = lock;
	}
	
}
