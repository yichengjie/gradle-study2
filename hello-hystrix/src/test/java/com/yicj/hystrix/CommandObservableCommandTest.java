package com.yicj.hystrix;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import rx.Observable;

/**
 * @program: hello-gradle
 * @description:
 * @author: yicj1
 * @create: 2022-07-31 15:36
 **/
@Slf4j
public class CommandObservableCommandTest {

    @Test
    public void testExecute(){
        CommandObservableCommand command = new CommandObservableCommand("张三") ;
        Observable<String> construct = command.construct();
        construct.subscribe(value -> log.info("===> value : {}", value)) ;
    }
}
