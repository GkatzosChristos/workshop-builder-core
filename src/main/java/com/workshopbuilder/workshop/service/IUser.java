package com.workshopbuilder.workshop.service;

import java.util.List;

import com.workshopbuilder.workshop.entity.User;

public interface IUser {

	List<User> getAllUsers();

	User getUserByName(String name);

	List<User> getAllUsersByRole(String role);
}
