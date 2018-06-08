package com.mybatis.web;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * author : elvin
 * time : 2018-01-08 02:33
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("index")
    public List<User> index(){

        List<User> all = userService.getAll();

        System.out.println("客户端读取到数据: " + all);

        return all;
    }

    @GetMapping("test")
    public String test(){
        return "usercontroller / test ";
    }

}
