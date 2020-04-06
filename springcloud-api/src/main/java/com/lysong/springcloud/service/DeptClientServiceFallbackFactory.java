package com.lysong.springcloud.service;

import com.lysong.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: LySong
 * @Date: 2020/4/6 13:27
 */
//降级
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept queryById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDname("id => " + id + "客户端提供了降级的信息，服务已关闭")
                        .setDb_source("没有数据");
            }

            @Override
            public List<Dept> queryAll() {
                return null;
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }
        };
    }
}
