package com.jyt.servicefeign.controller;

import com.jyt.servicefeign.service.SchedualServiceHi;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by xuwenjin on 2018-03-04
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

}
