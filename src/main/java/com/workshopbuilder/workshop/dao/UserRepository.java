package com.workshopbuilder.workshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshopbuilder.workshop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findByName(String name);

	List<User> findByRole(String role);
}
