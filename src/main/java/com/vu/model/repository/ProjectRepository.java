package com.vu.model.repository;

import java.util.List;

import com.vu.model.entity.Project;

public interface ProjectRepository {

	List<Project> findAll();
}
