package com.bai.impl;

import com.bai.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
@Slf4j
public class TestServiceImpl implements TestService {

    @Override
    public String getName(String name) {
        log.info(name);
        return "provide get name is :"+name;
    }
}
