package com.kyyblabla.test.admin.controller;

import com.kyyblabla.test.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kyy on 2018/1/19.
 */
@RequestMapping("/admin")
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hello")
    public String hello() {
        return adminService.hello("admin");
    }

    @Value("${foo}")
    private String foo;

    @GetMapping("/foo")
    public String foo() {
        return foo;
    }

}
