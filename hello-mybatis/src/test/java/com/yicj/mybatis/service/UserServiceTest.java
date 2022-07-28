package com.yicj.mybatis.service;

import com.yicj.mybatis.repo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService ;

    @Test
    public void batchInsert(){
        User user = new User() ;
        user.setUsername("张三");
        user.setAge(18);
        List<User> userList = Arrays.asList(
            user
        ) ;
        userService.batchInsert(userList) ;
    }

}
