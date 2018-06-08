package com.mybatis.service.impl;

import com.mybatis.dao.UserMapper;
import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;//不知道为啥也不可以运行

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }
}

