package com.kyyblabla.test.client.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by kyy on 2018/1/19.
 */
@Service
public class ClientService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloError")
    public String hello() {
        return restTemplate.getForObject("http://user.app/hello?name=client", String.class);
    }

    public String helloError() {
        return "helloError";
    }

}
