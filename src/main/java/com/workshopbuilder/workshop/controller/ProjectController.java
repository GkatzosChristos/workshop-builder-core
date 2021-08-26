package com.workshopbuilder.workshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.workshopbuilder.workshop.entity.Project;
import com.workshopbuilder.workshop.service.IProject;

@RestController
public class ProjectController {

	@Autowired
	private IProject iProject;

	@GetMapping("/project")
	public List<Project> findAllProjects() {
		return iProject.getAllProjects();
	}

	@GetMapping("/project/{name}")
	public Project findProjectByName(@PathVariable String name) {
		return iProject.getProjectByName(name);
	}

	@GetMapping("/project/status/{status}")
	public List<Project> findAllProjectsByStatus(@PathVariable String status) {
		return iProject.getAllProjectsByStatus(status);
	}

	@GetMapping("/project/user/{userId}")
	public List<Project> findAllProjectsByUserId(@PathVariable Long userId) {
		return iProject.getAllProjectsByUserId(userId);
	}
}
