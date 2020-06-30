package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced  // 授权 负载均衡 功能
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
//  相当于 applicationContext.xml  <bean id = "", class = ""