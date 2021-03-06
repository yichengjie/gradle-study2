package com.yicj.hello.threadpool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;


@Component
public class ThreadPoolSampleRunner implements ApplicationRunner {

    @Autowired
    private ThreadPoolTaskExecutor customAsyncThreadPool ;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        customAsyncThreadPool.execute(() -> {
            System.out.println("-----------");
            System.out.println("-----------");
            System.out.println("-----------");
            System.out.println("-----------");
        }) ;
    }
}
