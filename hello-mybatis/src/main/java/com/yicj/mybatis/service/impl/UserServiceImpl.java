package com.yicj.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yicj.mybatis.repo.entity.User;
import com.yicj.mybatis.repo.mapper.UserMapper;
import com.yicj.mybatis.service.UserService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public Integer batchInsert(List<User> userList){
        return baseMapper.insertBatchSomeColumn(userList);
    }
}
