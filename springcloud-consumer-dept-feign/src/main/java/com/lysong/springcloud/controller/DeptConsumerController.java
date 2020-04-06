package com.lysong.springcloud.controller;

import com.lysong.springcloud.pojo.Dept;
import com.lysong.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: LySong
 * @Date: 2020/4/3 13:34
 */
@RestController
public class DeptConsumerController {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.deptClientService.addDept(dept);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.deptClientService.queryAll();
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        return this.deptClientService.queryById(id);
    }
}
