package com.bai.controller;

import com.bai.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @DubboReference
    private TestService testService;

    @GetMapping("/consumer")
    public String getProviderName(String name){
        return testService.getName(name);
    }

}
