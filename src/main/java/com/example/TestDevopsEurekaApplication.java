package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yingmanji
 * @date 2021/9/29
 */
@SpringBootApplication
@EnableEurekaServer
public class TestDevopsEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestDevopsEurekaApplication.class,args);
    }
}
