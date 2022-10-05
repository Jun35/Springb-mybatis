package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.mapper")
public class SpringbootMybatisDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisDemo1Application.class, args);
	}

}
