package com.yicj.mybatis.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yicj.mybatis.repo.entity.User;

import java.util.List;

public interface UserService extends IService<User> {

    Integer batchInsert(List<User> userList) ;
}
