package com.lysong.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: LySong
 * @Date: 2020/4/3 13:49
 */
@Configuration
public class ConfigBean {
    /**
     * 配置负载均衡
     */
    @Bean
    /**
     * Ribbon
     * IRule
     * RoundRobinRule：轮询
     * RandomRule：随机
     * AvailabilityFilteringRule：会先过滤掉，跳闸，访问故障的服务，对剩下的进行轮询
     * RetryRule：会按轮询获取服务~ 如果服务获取失败，则会在指定的时间内进行重试
     */
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }



}
