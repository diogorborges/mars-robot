package com.contaazul.mars.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableCaching
@ComponentScan(basePackages = "com.contaazul.mars")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
