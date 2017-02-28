package com.asiainfo.integration.o2p.cfg.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.asiainfo.foundation.log.Logger;
import com.asiainfo.integration.o2p.cfg.dto.OperateProcess;
import com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService;

public class PropertiesInitServlet  extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger
            .getLog(PropertiesInitServlet.class);
	
	@Override
	public void init() throws ServletException {
	    ServletContext servletContext = this.getServletContext();  
        WebApplicationContext ctx = WebApplicationContextUtils .getWebApplicationContext(servletContext); 
	    ConfigurationManagementService service = (ConfigurationManagementService) ctx.getBean("configurationManagementService");
	    try {
			service.syncDbToZookeeper(new OperateProcess());
		} catch (Exception e) {
			log.error("init properties to zk error", e);
		}
	}
}
