package com.yicj.hello.config;

import com.yicj.hello.util.CommonUtil;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


public class ThreadPoolTaskExecutorImportRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(ThreadPoolTaskExecutor.class, ()->{
            ThreadPoolTaskExecutor executor = CommonUtil.initThreadPool();
            return executor;
        }) ;
        registry.registerBeanDefinition("customAsyncThreadPool", beanDefinition) ;
    }
}
