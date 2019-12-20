package com.ylw.springboot.mycat.mapper;

import com.ylw.springboot.mycat.entity.UserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
	@Select("SELECT * FROM  t_user ")
	public List<UserEntity> findUser();

	@Select("insert into t_user values (#{uuid},#{name},#{age},#{sex}); ")
	public List<UserEntity> insertUser(@Param("uuid") String uuid,@Param("name") String name,@Param("age") int age,@Param("sex") String sex);
}
