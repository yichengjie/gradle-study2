package com.yicj.hello.threadpool;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


public class ThreadPoolTaskExecutorFactoryBean implements FactoryBean<ThreadPoolTaskExecutor> {

    @Override
    public ThreadPoolTaskExecutor getObject() throws Exception {
        ThreadPoolTaskExecutor executor = ThreadPoolUtil.initThreadPool();
        return executor ;
    }

    @Override
    public Class<?> getObjectType() {
        return ThreadPoolTaskExecutor.class;
    }
}
