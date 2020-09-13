package com.wisdom.springcloud.service;

import com.wisdom.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author WisdomBao
 * @Date 2020/9/9 19:39
 * @Version 1.0
 */

public interface PaymentService {

    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);

}
