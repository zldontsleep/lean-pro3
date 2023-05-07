package com.gientech.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/user/downOrder")
    public String downOder() {
        String res = restTemplate.getForObject("http://order-service/order/create", String.class);
        System.out.println("调用库存放回信息："+res);
        return "用户下单成功！";
    }
}
