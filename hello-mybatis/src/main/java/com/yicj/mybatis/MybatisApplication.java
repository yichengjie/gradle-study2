package com.yicj.mybatis;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .web(WebApplicationType.SERVLET)
                .main(MybatisApplication.class)
                .run(args) ;
    }

}
