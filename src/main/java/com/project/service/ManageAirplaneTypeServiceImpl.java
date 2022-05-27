package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ManageAirplaneTypeDAO;
import com.project.model.ManageAirplaneTypeVO;
@Service
@Transactional

public class ManageAirplaneTypeServiceImpl implements ManageAirplaneTypeService{
	@Autowired
	private ManageAirplaneTypeDAO manageAirplaneTypeDao;

	@Override
	public void save(ManageAirplaneTypeVO manageAirplaneTypeVO) {
	
		this.manageAirplaneTypeDao.save(manageAirplaneTypeVO);
		
	}

	@Override
	public List<ManageAirplaneTypeVO> search() {

		return this.manageAirplaneTypeDao.search();
	}

	@Override
	public List<ManageAirplaneTypeVO> getByIdManageAirplaneType(int id) {

		return this.manageAirplaneTypeDao.getByIdManageAirplaneType(id);
	}

}
