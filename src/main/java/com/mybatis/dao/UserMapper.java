package com.mybatis.dao;

import com.mybatis.entity.User;

import java.util.List;

/**
 * Created by admin on 2018/6/8.
 */

public interface UserMapper {
    List<User> getAll();
}
