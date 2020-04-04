package com.lysong.springcloud.controller;

import com.lysong.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: LySong
 * @Date: 2020/4/3 13:34
 */
@RestController
public class DeptConsumerController {
    //消费者不应该有service层
    //RestTemp;ate .... 供我们直接调用就可以，注册到Spring中
    //(url,实体：map,Class<T> responseType)
    //请求地址，（有可能携带实体），返回类型
    //提供多种便捷访问远程Http服务的方法，简单的Restful风格服务模板
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add",dept,Boolean.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get",List.class);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }
}
