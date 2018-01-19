package com.kyyblabla.test.client.controller;

import com.kyyblabla.test.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kyy on 2018/1/19.
 */
@RequestMapping("/client")
@RestController
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/hello")
    public String info() {
        return clientService.hello();
    }
}
