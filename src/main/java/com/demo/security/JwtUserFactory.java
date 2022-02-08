package com.demo.security;

import com.demo.entity.User;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class JwtUserFactory {

	public static JwtUser create(User user) {
		return new JwtUser(user.getId(), user.getEmail(), user.getPassword());
	}
	


}