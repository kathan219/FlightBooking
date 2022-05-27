package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.model.ManageAirportVO;

@Service
@Transactional
public class ManageAirportDAOImpl implements ManageAirportDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(ManageAirportVO manageAirportVO) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(manageAirportVO);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirportVO> search() {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("From ManageAirportVO where status=true");
		List<ManageAirportVO> manageAirportList = query.list();

		return manageAirportList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageAirportVO> getByIdManageAirport(int id) {
		List<ManageAirportVO> manageAirportList= new ArrayList<ManageAirportVO>();
		try{
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from ManageAirportVO where status=true and id="+id);
			manageAirportList = (List<ManageAirportVO>)query.list();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return manageAirportList;
	}
}
