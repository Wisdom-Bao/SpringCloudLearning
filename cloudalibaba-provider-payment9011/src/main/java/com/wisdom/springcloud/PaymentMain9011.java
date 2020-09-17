package com.wisdom.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author WisdomBao
 * @Date 2020/9/17 11:36
 * @Version 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9011 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain9011.class, args);
    }
}
