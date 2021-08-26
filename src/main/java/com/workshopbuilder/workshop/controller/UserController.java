package com.workshopbuilder.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.workshopbuilder.workshop.entity.User;
import com.workshopbuilder.workshop.service.IUser;

@RestController
public class UserController {

	@Autowired
	private IUser iUser;

	@GetMapping("/user")
	public List<User> findAllUsers() {
		return iUser.getAllUsers();
	}

	@GetMapping("/user/{name}")
	public User findUserByName(@PathVariable String name) {
		return iUser.getUserByName(name);
	}

	@GetMapping("/user/role/{role}")
	public List<User> findAllUsersByRole(@PathVariable String role) {
		return iUser.getAllUsersByRole(role);
	}
}
