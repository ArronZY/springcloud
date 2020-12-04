package com.wtkj.springCloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wtkj_jxb_07 on 2020/11/23.
 */
@Configuration
public class config {
    @Bean
    @LoadBalanced  // Spring Cloud Ribbon 是基于 Netflix Ribbon 实现的一套客户端  负载均衡的工具。
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
