package com.atgui.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String getInvokeUrl(){
        log.info("*******  this is zookeeper call function ~~~~~" + INVOKE_URL + "/payment/consul");
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/consul",String.class);
        System.out.println(result + "  please check all those data `");
        return result;
    }

    @GetMapping(value = "consumer/getData/consul")
    public CommonResult getData(){
        //CommonResult payOne = restTemplate.getForObject(INVOKE_URL + "/payment/consul", CommonResult.class);
        CommonResult result = restTemplate.getForObject(INVOKE_URL + "/payment/consul", CommonResult.class);
        return result;
    }

}
