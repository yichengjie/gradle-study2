package com.yicj.hello.threadpool;

import org.springframework.core.annotation.AliasFor;

public @interface EnableCustomThreadPool {

    @AliasFor("prefix")
    String value() default "";

    String prefix() default "";
}
