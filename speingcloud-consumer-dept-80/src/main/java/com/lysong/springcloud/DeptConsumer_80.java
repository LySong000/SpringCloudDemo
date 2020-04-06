package com.lysong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Ribbon和Eureka整合以后，客户端可以直接调用，不用关心IP地址和端口号
 * @Author: LySong
 * @Date: 2020/4/3 14:06
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * 在微服务启动的时候就能去自动的加载我们自定义的Ribbon类
 */
public class DeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class, args);
    }
}
