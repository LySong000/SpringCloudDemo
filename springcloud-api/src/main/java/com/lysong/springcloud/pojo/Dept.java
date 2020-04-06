package com.lysong.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Dept 实体类 实体关系映射
 * @Author: LySong
 * @Date: 2020/4/2 12:30
 */
@Data
@Accessors(chain = true) //链式写法
public class Dept implements Serializable {
    /**
     * 主键
     */
    private Long deptno;

    /**
     * 部门名称
     */
    private String dname;

    /**
     * 这个数据存在哪个数据库的字段
     * 微服务一个服务对应一个数据库
     */
    private String db_source;

    public Dept() {
    }

    public Dept(String dname) {
        this.dname = dname;
    }
}
