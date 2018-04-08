package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.security.UserInfo;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public UserInfo getUserByName(String name) {
		User user = userMapper.getUserByName(name);
		System.out.println("----------->user:"+user.getName());
		//因为使用mybatis只方便将查询结果转化为User对象
		//但是对于程序逻辑来讲，需要将User变成UserInfo，因此调用UserInfo的构造方法，将User作为参数传入
		//这样，我们就获得了一个拥有User全部信息的UserInfo对象，将其返回
		return new UserInfo(user);
	}
}
