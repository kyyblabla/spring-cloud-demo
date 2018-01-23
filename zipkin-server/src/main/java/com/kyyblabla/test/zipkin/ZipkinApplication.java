package com.kyyblabla.test.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * Created by kyy on 2018/1/22.
 */
@EnableEurekaClient
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

    public static void main(String[] args) {

        SpringApplication.run(ZipkinApplication.class, args);

    }

}
