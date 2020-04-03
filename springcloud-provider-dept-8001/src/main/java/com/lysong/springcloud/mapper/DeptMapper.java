package com.lysong.springcloud.mapper;

import com.lysong.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: LySong
 * @Date: 2020/4/2 13:20
 */
@Mapper
@Repository
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();
}
