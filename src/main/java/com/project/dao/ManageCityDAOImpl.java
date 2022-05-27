package com.project.dao;

import java.util.ArrayList;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.model.ManageCityVO;

@Service
@Transactional
public class ManageCityDAOImpl implements ManageCityDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(ManageCityVO manageCityVO) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(manageCityVO);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageCityVO> search() {

		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from ManageCityVO where status=true");
		List<ManageCityVO> manageCityList = query.list();
		return manageCityList;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ManageCityVO> getByIdManageCity(int id) {
		List<ManageCityVO> manageCityList = new ArrayList<ManageCityVO>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query query = session.createQuery("from ManageCityVO where status= true and id =" + id);
			manageCityList = (List<ManageCityVO>) query.list();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return manageCityList;
	}

}
