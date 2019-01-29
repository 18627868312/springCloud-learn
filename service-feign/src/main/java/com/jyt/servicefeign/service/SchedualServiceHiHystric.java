package com.jyt.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * Create by xuwenjin on 2018-03-05
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
