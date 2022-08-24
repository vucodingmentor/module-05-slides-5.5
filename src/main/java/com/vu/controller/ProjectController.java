package com.vu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vu.model.dto.ProjectDto;
import com.vu.model.service.ProjectService;

@Controller
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@GetMapping("/")
	public String index(ModelMap model) {
		List<ProjectDto> dtos = projectService.getAll();
		model.addAttribute("projects", dtos);
		return "index";
	}
}
