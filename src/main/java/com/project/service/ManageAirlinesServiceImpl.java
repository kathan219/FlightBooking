package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ManageAirlinesDAO;
import com.project.model.ManageAirlinesVO;
@Service
@Transactional
public class ManageAirlinesServiceImpl implements ManageAirlinesService{
	@Autowired
	private ManageAirlinesDAO manageAirlinesDao;
	@Override
	public void save(ManageAirlinesVO manageAirlinesVO) {
		this.manageAirlinesDao.save(manageAirlinesVO);
	}
	@Override
	public List<ManageAirlinesVO> search() {

		return this.manageAirlinesDao.search();
	}
	@Override
	public List<ManageAirlinesVO> getByIdManageAirlines(int id) {
		
		return this.manageAirlinesDao.getByIdManageAirlines(id);
	}

}
