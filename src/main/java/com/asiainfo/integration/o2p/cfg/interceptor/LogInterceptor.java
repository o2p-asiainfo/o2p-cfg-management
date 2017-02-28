package com.asiainfo.integration.o2p.cfg.interceptor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.ailk.eaap.o2p.common.spring.config.EncryptPropertyPlaceholderConfigurer;
import com.ailk.eaap.o2p.common.util.CustomBase64;
import com.ailk.eaap.o2p.sqllog.model.OperateLog;
import com.ailk.eaap.o2p.sqllog.model.OperateLogData;
import com.ailk.eaap.op2.common.EAAPConstants;
import com.asiainfo.foundation.log.Logger;
import com.asiainfo.integration.o2p.cfg.dto.OperateProcess;
import com.asiainfo.integration.o2p.cfg.service.OperatorLogService;
import com.asiainfo.integration.o2p.web.bo.UserRoleInfo;
import com.asiainfo.integration.o2p.web.util.WebConstants;

@Component("logInterceptor")
@Aspect
public class LogInterceptor {
	@Pointcut("execution(* com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.update*(..))"
			+ " || execution(* com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.delete*(..))"
			+ " || execution(* com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.create*(..))"
			+ " || execution(* com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.copy*(..))"
			+ " || execution(* com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService.sync*(..))")  
    private void anyMethod(){}//定义一个切入点
	@Resource(name="operatorLogService")
	private OperatorLogService operatorLogService;
	private static final Logger LOG = Logger.getLog(LogInterceptor.class);
	
	@AfterReturning("com.asiainfo.integration.o2p.cfg.interceptor.LogInterceptor.anyMethod()")
	public void doAfter(JoinPoint point) {
		try {
			String methodName = point.getSignature().getName();
			String className = point.getTarget().getClass().getName();
			Object[] params = point.getArgs();
			if(params != null && params.length > 0) {
				if(params[0] instanceof OperateProcess) {
					OperateProcess op = (OperateProcess) params[0];
					if(op.getRequest() != null && op.getOperatorObjList() !=null && !op.getOperatorObjList().isEmpty()) {
						String ip = getIpAddr(op.getRequest());
						String userName = null;
						if(op.getRequest() != null) {
							UserRoleInfo userInfo = (UserRoleInfo) op.getRequest().getSession().getAttribute(WebConstants.O2P_SSO_USER_SESSION_KEY);
							if(userInfo != null) {
								userName = userInfo.getName() + "-" + userInfo.getTenantCode();
							} else {
								Cookie[] cookies = op.getRequest().getCookies();
								if(cookies != null){
									for (Cookie cookie : cookies) {
									    if(EAAPConstants.O2P_USER_NAME.equals(cookie.getName())){
									    	userName = this.getUserNameForCookie(cookie);
									    	userName = new String(CustomBase64.decode(base64Correct(userName)));
									    }
									}
								}
							}
						}
						if(userName==null && "true".equals(EncryptPropertyPlaceholderConfigurer.getContextProperty("CFG_CANCEL_AUTHENTICATE"))){
							userName = "none";
						}
						if(LOG.isDebugEnabled()) {
				    		LOG.debug("user info is {0}", userName);
				    	}
						OperateLog log = new OperateLog();
						log.setUserIp(ip);
						log.setUserName(userName);
						log.setExecClass(className);
						log.setExecMethod(methodName);
						log.setOptType("1");
						log.setCreateDate(new Date().getTime());
						log.setLogDataList(assertLogDateList(op.getOperatorObjList()));
						operatorLogService.recordOperateLog(log);
					}
				}
			}
		} catch (Exception e) {
			LOG.error("operator log error", e);
		}
	}
	
	public static String base64Correct(String base64str){
		switch(base64str.length()%4) {  
	        case 3:  
	        	base64str+= "==="; break;   
	        case 2:  
	        	base64str+= "=="; break;  
	        case 1:  
	        	base64str+= "="; break;  
	        default:  
	    }
		return base64str;
	}
	
	private List<OperateLogData> assertLogDateList(List<Object> operatorObjList) {
		if(operatorObjList == null || operatorObjList.size() == 0) {
			return null;
		}
		List<OperateLogData> dataList = new ArrayList<OperateLogData>();
		OperateLogData data = null;
		for(Object obj: operatorObjList) {
			data = new OperateLogData();
			data.setCreateDate(new Date().getTime());
			data.setDataLog(obj.toString());
			dataList.add(data);
		}
		return dataList;
	}
	
	private String getUserNameForCookie(Cookie cookie){
		String userName = "";
		if(!StringUtils.isEmpty(cookie.getValue())){
			userName = cookie.getValue();
		}
		return userName;
	}

	public static String getIpAddr(HttpServletRequest request) {  
		if(request == null) {
			return null;
		}
        String ip = request.getHeader("X-Forwarded-For");  
        if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("Proxy-Client-IP");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("WL-Proxy-Client-IP");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("HTTP_CLIENT_IP");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getHeader("HTTP_X_FORWARDED_FOR");  
            }  
            if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
                ip = request.getRemoteAddr();  
            }  
        } else if (ip.length() > 15) {  
            String[] ips = ip.split(",");  
            for (int index = 0; index < ips.length; index++) {  
                String strIp = (String) ips[index];  
                if (!("unknown".equalsIgnoreCase(strIp))) {  
                    ip = strIp;  
                    break;  
                }  
            }  
        }  
        return ip;
    }
}
