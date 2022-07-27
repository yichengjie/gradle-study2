package com.yicj.hello.factorybean;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfo implements Serializable {
    private String name ;
    private Integer age ;
}
