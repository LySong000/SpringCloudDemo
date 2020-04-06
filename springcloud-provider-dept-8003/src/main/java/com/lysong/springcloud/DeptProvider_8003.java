package com.lysong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @Author: LySong
 * @Date: 2020/4/2 23:04
 */
@SpringBootApplication
//服务启动后自动注册到Eureka中
@EnableEurekaClient
@EnableDiscoveryClient//服务发现
public class DeptProvider_8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class,args);
    }
}
