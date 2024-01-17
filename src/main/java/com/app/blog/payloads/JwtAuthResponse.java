package com.app.blog.payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	private String token;
	
	private UserDto user;
}
