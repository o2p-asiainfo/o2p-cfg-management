/** 
 * Project Name:o2p-configuration-management 
 * File Name:HomeController.java 
 * Package Name:com.asiainfo.eaap.integration.controller 
 * Date:2015年9月11日上午10:16:01 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.cfg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController
{
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome()
    {
        return "index";
    }
}
