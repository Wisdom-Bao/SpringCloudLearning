package com.wisdom.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author WisdomBao
 * @Date 2020/9/14 10:50
 * @Version 1.0
 */

@Component
public class PaymentFallbackService implements PaymentHystrixService{

    @Override
    public String paymentInfo_OK(Integer id) {
        return "payment fallback service ok";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "payment fallback service timeout";
    }
}
