package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.ManageScheduleVO;

@Service
@Transactional
public class ManageScheduleDAOImpl implements ManageScheduleDAO{

	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void save(ManageScheduleVO manageScheduleVO) {
		Session session=sessionFactory.getCurrentSession();
		session.saveOrUpdate(manageScheduleVO);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageScheduleVO> search() {

		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from ManageScheduleVO where status=true");
		List<ManageScheduleVO> manageScheduleList=query.list();
		return manageScheduleList;
		

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageScheduleVO> getByIdManageSchedule(int id) {

		List<ManageScheduleVO> manageScheduleList = new ArrayList<ManageScheduleVO>();
		try{
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from ManageScheduleVO where status=true and id="+id);
			manageScheduleList =(List<ManageScheduleVO>)query.list();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return manageScheduleList;
	}

}
