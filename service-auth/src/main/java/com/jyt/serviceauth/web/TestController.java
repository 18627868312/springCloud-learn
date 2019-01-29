package com.jyt.serviceauth.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/order/{id}")
    public String order(String id){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "order id :"+id;
    }

    @GetMapping("/product/{id}")
    public String product(String id){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "product id :"+id;
    }



}
