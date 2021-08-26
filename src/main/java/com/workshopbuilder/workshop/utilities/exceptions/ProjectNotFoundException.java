package com.workshopbuilder.workshop.utilities.exceptions;

public class ProjectNotFoundException extends RuntimeException {
	ProjectNotFoundException(String name) {
		super("Could not find project " + name);
	}
}
