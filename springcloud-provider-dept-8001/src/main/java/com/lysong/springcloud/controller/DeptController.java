package com.lysong.springcloud.controller;

import com.lysong.springcloud.Service.DeptService;
import com.lysong.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
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

}
