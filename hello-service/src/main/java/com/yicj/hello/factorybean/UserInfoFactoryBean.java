package com.yicj.hello.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserInfoFactoryBean implements FactoryBean<UserInfo> {
    @Override
    public UserInfo getObject() throws Exception {
        UUID uuid = UUID.randomUUID();
        UserInfo info = new UserInfo() ;
        info.setName(uuid.toString());
        info.setAge(18);
        return info;
    }

    @Override
    public Class<?> getObjectType() {
        return UserInfo.class;
    }
}
