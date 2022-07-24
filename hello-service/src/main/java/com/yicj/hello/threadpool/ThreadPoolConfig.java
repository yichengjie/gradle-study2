package com.yicj.hello.threadpool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import java.util.concurrent.Executor;


@Configuration
//@Import(ThreadPoolTaskExecutorImportRegister.class)
public class ThreadPoolConfig {

//    @Bean
//    public ThreadPoolTaskExecutorFactoryBean customAsyncThreadPool(){
//        return new ThreadPoolTaskExecutorFactoryBean() ;
//    }

    @Bean("customAsyncThreadPool")
    public ThreadPoolTaskExecutor customAsyncThreadPool() {
        ThreadPoolTaskExecutor executor = ThreadPoolUtil.initThreadPool();
        executor.initialize();
        return executor ;
    }

//    @Bean("customAsyncThreadPool")
//    public ThreadPoolTaskExecutor customAsyncThreadPool() {
//        return CommonUtil.initThreadPool();
//    }
}
