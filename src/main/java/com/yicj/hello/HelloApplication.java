package com.yicj.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        log.info("hello world");
        //SpringApplication.run(HelloApplication.class, args) ;
    }
}
