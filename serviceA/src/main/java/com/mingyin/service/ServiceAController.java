package com.mingyin.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController implements IServiceA {

	public String sayHello(@RequestParam("name") String name) {
		return "{'msg': 'hello, " + name + "'}";
	}

	@Override
	public String findById(String id) {
		String success = "查找id为:"+id+"的用户成功";
		return success;
	}

}