package com.workshopbuilder.workshop.service;

import java.util.List;

import com.workshopbuilder.workshop.entity.Project;

public interface IProject {

	List<Project> getAllProjects();

	Project getProjectByName(String name);

	List<Project> getAllProjectsByStatus(String status);

	List<Project> getAllProjectsByUserId(Long userId);
}
