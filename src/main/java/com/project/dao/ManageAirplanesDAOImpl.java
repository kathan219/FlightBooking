package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.ManageAirplanesVO;

@Service
@Transactional
public class ManageAirplanesDAOImpl implements ManageAirplanesDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(ManageAirplanesVO manageAirplanesVO) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(manageAirplanesVO);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirplanesVO> search() {
		
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from ManageAirplanesVO where status=true");
		List<ManageAirplanesVO> manageAirplanesList=query.list();
		return manageAirplanesList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirplanesVO> getByIdManageAirplanes(int id) {
		
		List<ManageAirplanesVO> manageAirplanesList = new ArrayList<ManageAirplanesVO>();
		try{
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from ManageAirplanesVO where status=true and id="+id);
			manageAirplanesList =(List<ManageAirplanesVO>)query.list();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return manageAirplanesList;
	}



}
