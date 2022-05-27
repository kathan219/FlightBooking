package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.hibernate.SessionFactory;

import com.project.model.ManageAirlinesVO;

@Service
@Transactional
public class ManageAirlinesDAOImpl implements ManageAirlinesDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void save(ManageAirlinesVO manageAirlinesVO) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(manageAirlinesVO);
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirlinesVO> search() {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from ManageAirlinesVO where status=true ");
		List<ManageAirlinesVO> manageAirlinesList=query.list();
		
		return manageAirlinesList;
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirlinesVO> getByIdManageAirlines(int id) {

		List<ManageAirlinesVO> manageAirlinesList= new ArrayList<ManageAirlinesVO>();
		try{
			Session session= sessionFactory.getCurrentSession();
			Query query= session.createQuery("from ManageAirlinesVO where status=true and id=" +id);
			manageAirlinesList=(List<ManageAirlinesVO>) query.list();
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return manageAirlinesList;
	}

}
