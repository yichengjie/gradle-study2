package com.yicj.hello.factorybean;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class UserInfoFactoryBeanTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext() ;
        context.register(UserInfoFactoryBean.class);
        context.refresh();
        //
        Object bean = context.getBean("userInfoFactoryBean");
        Object bean2 = context.getBean("userInfoFactoryBean");
        log.info("====> bean : {}", bean);
        log.info("====> bean2 : {}", bean2);
    }
}
