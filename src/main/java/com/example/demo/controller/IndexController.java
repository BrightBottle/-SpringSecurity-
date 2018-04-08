package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/login")
	public String userLogin() {
		return "demo-sign";
	}
	
	@RequestMapping("/login-error")
	public String loginError() {
		return "login-error";
	}
	
}
