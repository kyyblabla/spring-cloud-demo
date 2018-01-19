package com.kyyblabla.test.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by kyy on 2018/1/19.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigApplication.class, args);

    }
}
