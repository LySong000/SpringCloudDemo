package com.lysong.springcloud.controller;

import com.lysong.springcloud.Service.DeptService;
import com.lysong.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 提供Restful风格的接口
 * @Author: LySong
 * @Date: 2020/4/2 23:00
 */
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //H偶去一些配置的信息
    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept queryById(@PathVariable Long id){
        return deptService.queryById(id);
    }

    @GetMapping("/dept/get")
    public List<Dept> queryAll(){
        return deptService.queryAll();
    }

    //注册进来的微服务，获取一些消息
    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表的清单
        List<String> services = discoveryClient.getServices();
        System.out.println("discovery => " + services);

        //得到一个具体的微服务信息
        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost()+"\t"+
                            instance.getPort()+"\t"+
                            instance.getUri()+"\t"+
                            instance.getServiceId()+"\t"
            );
        }
        return this.discoveryClient;
    }

}
