package com.forkapp.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.forkapp.userservice.model.User;
import com.forkapp.userservice.service.UserService;

@RestController
public class UserController 
{
	@Autowired
	private UserService userService;
	
	@PostMapping("user")
	public User getUser(@RequestBody User user) {
		return userService.getUserFromDb(user);
	}
	
	@PostMapping("adduser")
	public String addUser(@RequestBody User user) {
		return userService.addUserToDb(user);
	}
}
