package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.ManageAirplaneTypeVO;

@Service 
@Transactional
public class ManageAirplaneTypeDAOImpl implements ManageAirplaneTypeDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(ManageAirplaneTypeVO manageAirplaneTypeVO) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(manageAirplaneTypeVO);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirplaneTypeVO> search() {
		
		Session session= sessionFactory.getCurrentSession();
		Query query=session.createQuery("from ManageAirplaneTypeVO where status=true");
		List<ManageAirplaneTypeVO> manageAirplaneTypeList=query.list();
		
		
		return manageAirplaneTypeList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirplaneTypeVO> getByIdManageAirplaneType(int id) {
		List<ManageAirplaneTypeVO> manageAirplaneTypeList=new ArrayList<ManageAirplaneTypeVO>();
		try {
			Session session= sessionFactory.getCurrentSession();
			Query query= session.createQuery("from ManageAirplaneTypeVO where status=true and id =" +id);
			manageAirplaneTypeList= (List<ManageAirplaneTypeVO>) query.list();
		}catch(Exception e)
		{
			e.printStackTrace();
		
		}
	
		return manageAirplaneTypeList;
	}

	
}
