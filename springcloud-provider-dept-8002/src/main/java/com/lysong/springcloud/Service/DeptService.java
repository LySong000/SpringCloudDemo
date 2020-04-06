package com.lysong.springcloud.Service;

import com.lysong.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author: LySong
 * @Date: 2020/4/2 22:57
 */
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
