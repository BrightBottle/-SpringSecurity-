package com.example.demo.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.model.Role;
import com.example.demo.model.User;

public class UserInfo extends User implements UserDetails {
	
	private static final long serialVersionUID = 3685696481952428279L;

	public UserInfo(User user) {
		if (user != null) {
			this.setId(user.getId());
			this.setName(user.getName());
			this.setEmail(user.getEmail());
			this.setPassword(user.getPassword());
			this.setDob(user.getDob());
			this.setRoles(user.getRoles());
		}
	}
	
	/**
	 * 返回权限
	 * */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		
		//直接拿到UserInfo父类User的roles属性
		List<Role> roles = this.getRoles();

		if (roles != null) {
			for (Role role : roles) {
				//这个是固定写法，创建SimpleGrantedAuthority对象，调用构造方法，将当前user的role名称信息传入
				SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
				//将user拥有的全部角色名称信息，已遍历的形式依次放入集合authorities
				authorities.add(authority);
			}
		}
		//将集合进行返回
		return authorities;
	}

	@Override
	public String getUsername() {
		return super.getName();
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}

	

	
}