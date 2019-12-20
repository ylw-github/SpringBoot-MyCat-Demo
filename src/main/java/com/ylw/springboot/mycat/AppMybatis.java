package com.ylw.springboot.mycat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ylw.springboot.mycat.mapper")
public class AppMybatis {

	public static void main(String[] args) {
		SpringApplication.run(AppMybatis.class, args);
	}

}
