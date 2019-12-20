package com.ylw.springboot.mycat.controller;

import com.ylw.springboot.mycat.entity.UserEntity;
import com.ylw.springboot.mycat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public List<UserEntity> findUser() {
        return userService.findUser();
    }

    @RequestMapping("/insertUser")
    public List<UserEntity> insertUser(String name, int age, String sex) {
        return userService.insertUser(UUID.randomUUID().toString(), name, age, sex);
    }

}
