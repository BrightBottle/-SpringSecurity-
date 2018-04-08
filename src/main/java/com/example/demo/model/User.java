package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5123800944024916184L;

	private Integer id;

	private String name; // 用户名

	private String email;// 用户邮箱

	private String password;// 用户密码

	private Date dob;// 时间

	private List<Role> roles;// 所对应的角色集合

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", dob=" + dob
				+ ", roles=" + roles + "]";
	}

	
}
