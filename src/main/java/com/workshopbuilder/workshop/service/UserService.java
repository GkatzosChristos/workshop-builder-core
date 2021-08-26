package com.workshopbuilder.workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshopbuilder.workshop.dao.UserRepository;
import com.workshopbuilder.workshop.entity.User;

@Service
public class UserService implements IUser {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserByName(String name) {
		return userRepository.findByName(name);
	}

	public List<User> getAllUsersByRole(String role) {
		return userRepository.findByRole(role);
	}
}
