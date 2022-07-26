package com.yicj.hystrix;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import rx.Observable;

import java.util.concurrent.Future;

@Slf4j
public class HelloWorldTest {

    @Test
    public void hello(){
        String value = new CommandHelloWorld("Bob").execute();
        Future<String> future = new CommandHelloWorld("Bob").queue();
        Observable<String> observable = new CommandHelloWorld("Bob").observe();
        log.info("value : {}", value);
    }
}
