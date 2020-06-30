package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  // 切记 添加负载均衡 注解，否则无法正常访问
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
