package com.kyyblabla.test.user;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kyy on 2018/1/19.
 */
@EnableEurekaClient
@SpringBootApplication
@RestController
public class UserApplication {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "none") String name) {
        return String.format("[%s]:hello:%s", port, name);
    }

    public static void main(String[] args) {

        SpringApplication.run(UserApplication.class, args);

    }
}
