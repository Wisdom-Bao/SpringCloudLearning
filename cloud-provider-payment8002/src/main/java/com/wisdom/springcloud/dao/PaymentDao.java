package com.wisdom.springcloud.dao;

import com.wisdom.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author WisdomBao
 * @Date 2020/7/19 14:46
 * @Version 1.0
 */

@Mapper
public interface PaymentDao {

    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);

}
