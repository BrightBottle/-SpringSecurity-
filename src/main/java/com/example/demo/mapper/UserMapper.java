package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

@Mapper
public interface UserMapper {

	/**
	 * 根据用户名查询User信息，为后续的登录验证做准备
	 * */
	public User getUserByName(String name);
	
}
