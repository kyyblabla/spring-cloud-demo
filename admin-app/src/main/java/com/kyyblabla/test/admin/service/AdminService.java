package com.kyyblabla.test.admin.service;

import com.kyyblabla.test.admin.service.error.AdminServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by kyy on 2018/1/19.
 */
@FeignClient(value = "user.app", fallback = AdminServiceHystric.class)
public interface AdminService {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);

}
