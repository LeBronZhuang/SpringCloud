package com.qf.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user")
public interface FeignInsterface {

    @GetMapping("/get")

    String get(String name);

}
