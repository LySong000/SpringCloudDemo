package com.lysong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: LySong
 * @Date: 2020/4/4 14:50
 */
@SpringBootApplication
//服务端启动类
@EnableEurekaServer
public class EurekaServer_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class,args);
    }
}
