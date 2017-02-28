/** 
 * Project Name:o2p-configuration-management 
 * File Name:Curator.java 
 * Package Name:com.asiainfo.eaap.integration.zookeeper 
 * Date:2015年8月27日下午8:52:26 
 * Copyright (c) 2015, www.asiainfo.com All Rights Reserved. 
 * 
 */

package com.asiainfo.integration.o2p.cfg.zookeeper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jms.IllegalStateException;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.data.Stat;

import com.ailk.eaap.o2p.common.spring.config.ZooKeeperFactory;
import com.asiainfo.integration.o2p.cfg.service.ConfigurationManagementService;
import com.linkage.rainbow.util.StringUtil;

public class Curator
{
    private CuratorFramework client;
    private static final String encoding = "UTF-8";
    
    public Curator() {
    	client = ZooKeeperFactory.get();
    }
    
    public Curator(String connectString,  String namespace) {
    	RetryPolicy retryPolicy = new ExponentialBackoffRetry(
    			ZooKeeperFactory.BASE_SLEEP_TIMEMS, ZooKeeperFactory.MAX_RETRIES);
    	client = CuratorFrameworkFactory.builder()
                .connectString(connectString).retryPolicy(retryPolicy)
                .namespace(namespace).build();
        client.start();
    }

    // 根据PATH递归创建节点
    public void createZNode(String path) throws Exception
    {
        createZNode(path, null);
    }

    // 根据PATH、MESSAGE创建节点
    public String createZNode(String path, String message) throws Exception
    {
        if (StringUtil.isEmpty(message))
        {
            return client.create().creatingParentsIfNeeded()
                    .withMode(CreateMode.PERSISTENT).forPath(path);
        }
        else
        {
            return client.create().creatingParentsIfNeeded()
                    .withMode(CreateMode.PERSISTENT)
                    .forPath(path, message.getBytes(encoding));
        }
    }

    public Stat existsZNode(String path) throws KeeperException,
            InterruptedException, Exception
    {
        return client.checkExists().forPath(path);
    }

    // 强制删除PATH
    public void deleteZNode(String path) throws Exception
    {
        client.delete().forPath(path);
        if(existsZNode(path) != null) {
        	throw new IllegalStateException("can not delete znode, path=" + path);
        }
    }

    // 强制递归删除PATH子节点
    public void deletingChildrenIfNeededZNode(String path) throws Exception
    {
        Stat stat = new Stat();
        client.getData().storingStatIn(stat).forPath(path);
        client.delete().guaranteed().deletingChildrenIfNeeded()
                .withVersion(stat.getVersion()).forPath(path);
    }

    // 获取PATH数据
    public Object getData(String path) throws Exception
    {
        Stat stat = new Stat();
        String data = new String(client.getData().storingStatIn(stat)
                .forPath(path), encoding);
        if ("".equals(data) && stat.getNumChildren() > 0)
        {
            List<String> list = client.getChildren().forPath(path);
            List<Map<String, Object>> dataList = new ArrayList<Map<String, Object>>();
            for (String str : list)
            {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put(str,
                        new String(
                                client.getData()
                                        .storingStatIn(stat)
                                        .forPath(path+ ConfigurationManagementService.separator+ str),"UTF-8"));
                dataList.add(map);
            }
            return dataList;
        }

        return data;
    }

    // 根据PATH、MESSAGE更新数据
    public void updateData(String path, String message) throws Exception
    {
        Stat stat = new Stat();
        client.getData().storingStatIn(stat).forPath(path);
        if(message != null) {
	        client.setData().withVersion(stat.getVersion())
	                .forPath(path, message.getBytes(encoding));
        } else {
        	client.setData().withVersion(stat.getVersion())
            .forPath(path,null);
        }
    }

    // 返回PATH子节点
    public List<String> getChildren(String path) throws Exception
    {
        return client.getChildren().forPath(path);
    }
}
