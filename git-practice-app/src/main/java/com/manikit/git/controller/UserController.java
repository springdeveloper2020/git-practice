package com.manikit.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	//Create new User
	@PostMapping("/createUser")
	public String createUser(@RequestBody User user) {
		User newUser = new User();
		newUser.setId(user.getId());
		newUser.setName(user.getName());
		newUser.setDesc(user.getDesc());
		System.out.println(newUser);
	return "user created..!";
	}
	
	public String deleteUser() {
		return"user deleted..!";
	}
	
	
	
	

}
