package com.yicj.hystrix;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import rx.Observable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Slf4j
public class HelloWorldTest {

    @Test
    public void hello() throws ExecutionException, InterruptedException {
        String value = new CommandHelloWorld("Bob").execute();
        Future<String> future = new CommandHelloWorld("Bob").queue();
        Observable<String> observable = new CommandHelloWorld("Bob").observe();
        log.info("=====> value : {}", value);
        log.info("=====> feature value : {}", future.get());
        observable.subscribe(val -> log.info("======> observable val : {}", val)) ;
    }
}
