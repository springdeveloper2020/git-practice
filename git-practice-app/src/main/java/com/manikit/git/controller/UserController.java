package com.manikit.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manikit.git.entities.User;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser() {
		User user = new User();
		user.setId(100l);
		user.setName("Amit");
		user.setDesc("fraud-user");
		return user;
	}

}
