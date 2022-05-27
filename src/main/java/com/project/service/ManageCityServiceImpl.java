package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ManageCityDAO;
import com.project.model.ManageCityVO;


@Service
@Transactional

public class ManageCityServiceImpl implements ManageCityService {
	@Autowired
	private ManageCityDAO manageCityDAO;
	@Override
	public void save(ManageCityVO manageCityVO) {
		this.manageCityDAO.save(manageCityVO);
		
	}

	@Override
	public List<ManageCityVO> search() {
	 return this.manageCityDAO.search();
	}

	@Override
	public List<ManageCityVO> getByIdManageCity(int id) {
		
		return this.manageCityDAO.getByIdManageCity(id);
	}

}
