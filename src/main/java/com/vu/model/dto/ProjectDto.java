package com.vu.model.dto;

public class ProjectDto {

	private int id;

	private String name;

	private Integer size;

	public ProjectDto(int id, String name, Integer size) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
	}

	public ProjectDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}
}
