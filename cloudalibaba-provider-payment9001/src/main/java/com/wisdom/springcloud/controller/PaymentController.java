package com.wisdom.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WisdomBao
 * @Date 2020/9/17 11:28
 * @Version 1.0
 */

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id){
        return "nacos registry, server port" + port + "\t id" + id;
    }

}
