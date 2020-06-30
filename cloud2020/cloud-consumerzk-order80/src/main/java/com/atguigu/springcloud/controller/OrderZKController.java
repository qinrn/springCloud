package com.atguigu.springcloud.controller;


import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String getInvokeUrl(){
        log.info("*******  this is zookeeper call function ~~~~~" + INVOKE_URL + "/payment/zk");
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk",String.class);
        System.out.println(result + "  please check all those data `");
        return result;
    }

    @GetMapping(value = "consumer/getData/zk")
    public CommonResult getData(){
        //CommonResult payOne = restTemplate.getForObject(INVOKE_URL + "/payment/zk", CommonResult.class);
        CommonResult result = restTemplate.getForObject(INVOKE_URL + "/payment/zk", CommonResult.class);
        return result;
    }
}
