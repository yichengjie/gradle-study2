package com.yicj.hello;

import org.junit.Test;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationBuilderTest {


    @Test
    public void test1(){
       String [] args = new String[0] ;
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(HelloServiceApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        System.out.println("------");
    }
}
