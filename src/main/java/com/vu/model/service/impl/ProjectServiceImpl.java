package com.vu.model.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vu.model.dto.ProjectDto;
import com.vu.model.entity.Project;
import com.vu.model.repository.ProjectRepository;
import com.vu.model.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectRepository;
	
	@Override
	public List<ProjectDto> getAll() {
		List<Project> entities = projectRepository.findAll();
		List<ProjectDto> dtos = new ArrayList<ProjectDto>();
		for (Project project : entities) {
			dtos.add(new ProjectDto(
					project.getId(), 
					project.getName(), 
					project.getSize()));
		}
		return dtos;
	}

}
