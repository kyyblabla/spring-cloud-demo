package com.kyyblabla.test.admin.service.error;

import com.kyyblabla.test.admin.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * Created by kyy on 2018/1/19.
 */
@Component
public class AdminServiceHystric implements AdminService {

    @Override
    public String hello(String name) {
        return "infoError";
    }
}
