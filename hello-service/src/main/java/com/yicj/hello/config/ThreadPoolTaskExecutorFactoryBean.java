package com.yicj.hello.config;

import com.yicj.hello.util.CommonUtil;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


public class ThreadPoolTaskExecutorFactoryBean implements FactoryBean<ThreadPoolTaskExecutor> {

    @Override
    public ThreadPoolTaskExecutor getObject() throws Exception {
        ThreadPoolTaskExecutor executor = CommonUtil.initThreadPool();
        return executor ;
    }

    @Override
    public Class<?> getObjectType() {
        return ThreadPoolTaskExecutor.class;
    }
}
