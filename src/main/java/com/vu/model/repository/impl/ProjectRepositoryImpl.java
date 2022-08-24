package com.vu.model.repository.impl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vu.model.entity.Project;
import com.vu.model.repository.ProjectRepository;

@Repository
@Transactional(rollbackOn = Exception.class)
public class ProjectRepositoryImpl implements ProjectRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Project> findAll() {
		List<Project> projects = new ArrayList<Project>();
		Session session = sessionFactory.getCurrentSession();
		Query<Project> query = session.createQuery("FROM Project", Project.class);
		projects = query.getResultList();
		return projects;
	}

}
