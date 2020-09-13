package com.wisdom.springcloud.service.impl;

import com.wisdom.springcloud.dao.PaymentDao;
import com.wisdom.springcloud.entities.Payment;
import com.wisdom.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author WisdomBao
 * @Date 2020/9/9 19:40
 * @Version 1.0
 */

@Service
public class PaymentSereviceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
