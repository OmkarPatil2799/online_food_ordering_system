package com.app.sec;

import java.util.Collections;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
	
	private String email;
	private String password;
	
	public ShopUser toUser() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority("ROLE_CUSTOMER");
		ShopUser user = new ShopUser(email, password, 
				Collections.singletonList(authority));
		return user;
	}
	
}
