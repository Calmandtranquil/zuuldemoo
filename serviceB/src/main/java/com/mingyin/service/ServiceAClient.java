package com.mingyin.service;

import org.springframework.cloud.netflix.feign.FeignClient;


@FeignClient(value = "ServiceA")
public interface ServiceAClient extends IServiceA {

}
