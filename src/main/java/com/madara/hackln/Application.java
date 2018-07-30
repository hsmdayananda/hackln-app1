package com.madara.hackln;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = "com.madara.hackln")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
