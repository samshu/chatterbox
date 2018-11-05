package com.aathif.chatterbox.api;

import java.util.Arrays;

import com.aathif.chatterbox.services.UserService;

public class UserAPI {

	private final UserService userService;

	public UserAPI(UserService userService) {
		this.userService = userService;
	}

	public void getAllUsers() {
		System.out.println("List of all users: " + Arrays.deepToString(userService.getAllUsers()));
	}

}
