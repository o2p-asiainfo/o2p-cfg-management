package com.asiainfo.integration.o2p.cfg.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

import com.asiainfo.integration.o2p.cfg.util.Constant;
import com.asiainfo.integration.o2p.cfg.util.DateUtil;

public class ZkPath implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Integer id;
    private Integer pId;
    private String text;
    private String type;
    private Integer dirType;
    private Date dirCreateTime;
    private String dirState;
    private Date dirLastestTime;
    private List<ZkPath> children;
    private Map<String, Object> state = new HashMap<String, Object>();

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getpId()
    {
        return pId;
    }

    public void setpId(Integer pId)
    {
        this.pId = pId;
    }

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public List<ZkPath> getChildren()
    {
        return children;
    }

    public void setChildren(List<ZkPath> children)
    {
        this.children = children;
    }
    
    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDirCreateTime()
    {
		if(dirCreateTime != null) {
			return new Date(dirCreateTime.getTime());
		} else {
			return null;
		}
    }

    public void setDirCreateTime(Date dirCreateTime)
    {
    	if(dirCreateTime != null) {
    		this.dirCreateTime = new Date(dirCreateTime.getTime());
    	} else {
    		this.dirCreateTime = null;
    	}
    }

    public String getDirState()
    {
        return dirState;
    }

    public void setDirState(String dirState)
    {
        this.dirState = dirState;
    }

    public Date getDirLastestTime()
    {
    	if(dirLastestTime != null) {
    		return new Date(dirLastestTime.getTime());
    	} else {
    		return null;
    	}
    }

    public void setDirLastestTime(Date dirLastestTime)
    {
    	if(dirLastestTime != null) {
    		this.dirLastestTime = new Date(dirLastestTime.getTime());
    	} else {
    		this.dirLastestTime = null;
    	}
    }

	public Map<String, Object> getState() {
		state.put("opened", true);
		return state;
	}

	public void setState(Map<String, Object> state) {
		this.state = state;
	}

	public Integer getDirType() {
		return dirType;
	}

	public void setDirType(Integer dirType) {
		if(Constant.DIRECTORY_SPEC_PROPERTIES == dirType) {
			this.type = Constant.DIRECTORY_SPEC_PROPERTIES_NAME;
		} else {
			this.type = Constant.DIRECTORY_SPEC_NON_PROPERTIES_NAME;
		}
		this.dirType = dirType;
	}

	@Override
	public String toString() {
		JSONObject obj = new JSONObject();
		obj.put("id", this.id);
		obj.put("pId", this.pId);
		obj.put("name", this.text);
		obj.put("dirType", this.dirType);
		obj.put("createTime", DateUtil.formatDate(this.dirCreateTime));
		obj.put("state", this.dirState);
		obj.put("modifyTime", DateUtil.formatDate(this.dirLastestTime));
		return obj.toString();
	}
}
