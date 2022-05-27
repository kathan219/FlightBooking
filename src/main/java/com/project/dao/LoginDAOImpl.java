package com.project.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.project.model.LoginVO;

@Service
@Transactional


public class LoginDAOImpl implements LoginDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<LoginVO> search() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from LoginVO where enabled=1 ");
	
		List<LoginVO> loginList=query.list();
		System.out.println("Login List"+loginList);
		return loginList;
	}

}
