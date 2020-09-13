package com.wisdom.springcloud.controller;

import com.wisdom.springcloud.entities.CommonResult;
import com.wisdom.springcloud.entities.Payment;
import com.wisdom.springcloud.service.PaymentFeignService;
import feign.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author WisdomBao
 * @Date 2020/9/13 10:30
 * @Version 1.0
 */

@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return paymentFeignService.getPaymentById(id);
    }

    //opfeign-ribbon,客户端一般默认等待1秒
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    }

}
