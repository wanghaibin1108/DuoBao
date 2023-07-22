package com.example.duobaoeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringCloudApplication
@EnableEurekaServer
@SpringBootApplication
public class DuoBaoEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DuoBaoEurekaApplication.class, args);
    }

}
