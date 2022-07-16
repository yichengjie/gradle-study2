package com.yicj.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class HelloServiceApplication {

    public static void main(String[] args) {
        log.info("-----> hello world ");
        SpringApplication.run(HelloServiceApplication.class, args) ;
    }
}
