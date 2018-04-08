package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.service.UserService;;

//帮助你扫描到这个bean，方便别的位置通过@Autowired去直接注入（创建对象实例）
@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	public UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	
		UserInfo userInfo = userService.getUserByName(username);
		System.out.println("------------>userInfo:"+userInfo.getPassword());
		return userInfo;
	}
}
