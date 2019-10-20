package com.mingyin.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
public interface IServiceA {
    @RequestMapping(value = "/sayHello",
            method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name);


    @RequestMapping(value = "/findById",method = RequestMethod.GET)
    String findById(@RequestParam("id") String id);
}
