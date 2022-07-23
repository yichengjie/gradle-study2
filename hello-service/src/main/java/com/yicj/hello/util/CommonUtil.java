package com.yicj.hello.util;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadPoolExecutor;

public class CommonUtil {

    public static ThreadPoolTaskExecutor initThreadPool(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //最大线程数
        executor.setMaxPoolSize(32);
        //核心线程数
        executor.setCorePoolSize(16);
        //任务队列的大小
        executor.setQueueCapacity(10000);
        //线程池名的前缀
        executor.setThreadNamePrefix("custom-thread-pool");
        //允许线程的空闲时间30秒
        executor.setKeepAliveSeconds(300);
        //设置线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean
        executor.setWaitForTasksToCompleteOnShutdown(true);
        //设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是阻塞住
        executor.setAwaitTerminationSeconds(60);
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        //线程初始化
        // executor.initialize();
        return executor;
    }
}
