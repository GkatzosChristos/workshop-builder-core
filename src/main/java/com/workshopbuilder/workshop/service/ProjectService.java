package com.workshopbuilder.workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshopbuilder.workshop.dao.ProjectRepository;
import com.workshopbuilder.workshop.entity.Project;

@Service
public class ProjectService implements IProject {

	@Autowired
	private ProjectRepository projectRepository;

	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	public Project getProjectByName(String name) {
		return projectRepository.findByName(name);
	}

	public List<Project> getAllProjectsByStatus(String status) {
		return projectRepository.findAllByStatus(status);
	}

	public List<Project> getAllProjectsByUserId(Long userId) {
		return projectRepository.findAllByUserId(userId);
	}

}
