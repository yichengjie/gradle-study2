package com.yicj.hystrix;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import rx.Observable;
import rx.schedulers.Schedulers;


/**
 * @program: hello-gradle
 * @description:
 * @author: yicj1
 * @create: 2022-07-31 11:28
 **/
@Slf4j
public class CommandObservableCommand extends HystrixObservableCommand<String> {

    private final String name ;

    public CommandObservableCommand(String name){
        super(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"));
        this.name = name ;
    }

    @Override
    protected Observable<String> construct() {
        return Observable.unsafeCreate((Observable.OnSubscribe<String>) observer -> {
            try {
                if (!observer.isUnsubscribed()) {
                    // 网络请求
                    observer.onNext("Hello");
                    observer.onNext(name + "!");
                    observer.onCompleted();
                }
            } catch (Exception e) {
                observer.onError(e);
            }
        }).subscribeOn(Schedulers.io());
    }

}
