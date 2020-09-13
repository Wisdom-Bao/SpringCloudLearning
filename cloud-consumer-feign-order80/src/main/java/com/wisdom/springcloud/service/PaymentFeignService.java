package com.wisdom.springcloud.service;

import com.wisdom.springcloud.entities.CommonResult;
import com.wisdom.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author WisdomBao
 * @Date 2020/9/13 9:53
 * @Version 1.0
 */

@Component
@FeignClient(value = "ClOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping(value = "payment/feign/timeout")
    public String paymentFeignTimeout();

}
