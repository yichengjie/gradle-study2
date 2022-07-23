package com.yicj.hello.config;

import com.yicj.hello.util.CommonUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import java.util.concurrent.Executor;


@Configuration
//@Import(ThreadPoolTaskExecutorImportRegister.class)
public class AsyncScheduledTaskConfig {

//    @Bean
//    public ThreadPoolTaskExecutorFactoryBean customAsyncThreadPool(){
//        return new ThreadPoolTaskExecutorFactoryBean() ;
//    }

    @Bean("customAsyncThreadPool")
    public Executor customAsyncThreadPool() {
        return CommonUtil.initThreadPool();
    }
}
