package com.workshopbuilder.workshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workshopbuilder.workshop.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

	Project findByName(String name);

	List<Project> findAllByStatus(String Status);

	List<Project> findAllByUserId(Long userId);
}
