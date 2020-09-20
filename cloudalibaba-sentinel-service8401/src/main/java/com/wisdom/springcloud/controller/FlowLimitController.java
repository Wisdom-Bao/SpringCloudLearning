package com.wisdom.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author WisdomBao
 * @Date 2020/9/19 17:10
 * @Version 1.0
 */

@RestController
public class FlowLimitController {

    @GetMapping(value = "testa")
    public String testa(){
        return "testa";
    }

    @GetMapping(value = "testb")
    public String testb(){
        return "testb";
    }

}
