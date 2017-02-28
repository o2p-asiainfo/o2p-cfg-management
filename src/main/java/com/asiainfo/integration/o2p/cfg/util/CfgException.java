package com.asiainfo.integration.o2p.cfg.util;

import com.asiainfo.foundation.exception.BusinessException;
import com.asiainfo.foundation.exception.Result;

public class CfgException extends BusinessException{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7636252675570711205L;
	private Result result;
	private Throwable cause = this;
	
	/**
	 * 构造方法，支持国际化
	 * @param code	返回码
	 * @param key   消息 key
	 * @param msgArgs  消息参数
	 * @param msg	返回消息
	 * @param cause 异常堆栈
	 */
	public CfgException(int code, String key,String[] msgArgs, Throwable cause) {
		super(code, key, msgArgs, cause);
		String msg =getMessage(key, msgArgs);
		this.cause = cause;
		this.result = new Result(code, msg);
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}
}
