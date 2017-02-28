/** 
 * Project Name:o2p-configuration-management 
 * File Name:CfgProperties.java 
 * Package Name:com.asiainfo.eaap.integration.dto 
 * Date:2015年8月28日下午4:49:27 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.cfg.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

import com.asiainfo.integration.o2p.cfg.util.DateUtil;

public class CfgProperties implements Serializable,Cloneable
{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer dirId;
    private String key;
    private String proDataType;
    private String value;
    private String proValueBuffer;
    private String proType;
    private int lock;
    private String moduleName;
    private String group;
    private String groupDesc;
    private String effectZone;
    private Date createDt;
    private Date modifyDt;
    private String state;
    private String proConstraint;
    private String description;
    private String synStatus;
    private String error;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDirId() {
		return dirId;
	}

	public void setDirId(Integer dirId) {
		this.dirId = dirId;
	}

	public String getProDataType()
    {
        return proDataType;
    }

    public void setProDataType(String proDataType)
    {
        this.proDataType = proDataType;
    }

    public String getProValueBuffer()
    {
        return proValueBuffer;
    }

    public void setProValueBuffer(String proValueBuffer)
    {
        this.proValueBuffer = proValueBuffer;
    }
    
    public String getProConstraint() {
		return proConstraint;
	}

	public void setProConstraint(String proConstraint) {
		this.proConstraint = proConstraint;
	}

	public String getProType()
    {
        return proType;
    }

    public void setProType(String proType)
    {
        this.proType = proType;
    }

    public String getModuleName()
    {
        return moduleName;
    }

    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }

    public String getGroupDesc()
    {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc)
    {
        this.groupDesc = groupDesc;
    }

    public String getEffectZone()
    {
        return effectZone;
    }

    public void setEffectZone(String effectZone)
    {
        this.effectZone = effectZone;
    }

    @XmlElement
    public Date getCreateDt()
    {
    	if(createDt != null) {
    		return new Date(createDt.getTime());
    	} else {
    		return null;
    	}
    }

    public void setCreateDt(Date createDt)
    {
    	if(createDt != null) {
    		this.createDt = new Date(createDt.getTime());
    	} else {
    		this.createDt = null;
    	}
    }

    @XmlElement
    public Date getModifyDt()
    {
    	if(modifyDt == null) {
    		return null;
    	} else {
    		return new Date(modifyDt.getTime());
    	}
    }

    public void setModifyDt(Date modifyDt)
    {
    	if(modifyDt != null) {
    		this.modifyDt = new Date(modifyDt.getTime());
    	} else {
    		this.modifyDt = null;
    	}
    }

    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public int getLock()
    {
        return lock;
    }

    public void setLock(int lock)
    {
        this.lock = lock;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getSynStatus() {
		return synStatus;
	}

	public void setSynStatus(String synStatus) {
		this.synStatus = synStatus;
	}
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public String toString()
    {
        return "id:" + this.id + ",key:" + this.key + ",proDataType="
                + this.proDataType + ",value=" + this.value
                + ",proValueBuffer=" + this.proValueBuffer + ",proType="
                + this.proType + ",proEncrypt=" + this.state + ",moduleName="
                + this.moduleName + ",groupName=" + this.group + ",groupDesc="
                + this.groupDesc + ",effectZone=" + this.effectZone
                + ",createDt=" + DateUtil.formatDate(this.createDt)
                + ",modifyDt=" + DateUtil.formatDate(this.modifyDt);
    }
}
