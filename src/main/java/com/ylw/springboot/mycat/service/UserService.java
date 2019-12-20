package com.ylw.springboot.mycat.service;

import com.ylw.springboot.mycat.entity.UserEntity;
import com.ylw.springboot.mycat.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public List<UserEntity> findUser() {
		return userMapper.findUser();
	}

	public List<UserEntity> insertUser(String uuid,String name,int age,String sex) {
		return userMapper.insertUser(uuid,name,age,sex);
	}

}
