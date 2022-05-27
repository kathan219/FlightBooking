package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ManageAirplanesDAO;
import com.project.model.ManageAirplanesVO;

@Service
@Transactional
public class ManageAirplanesServiceImpl implements ManageAirplanesService{

@Autowired
private ManageAirplanesDAO manageAirplanesdao;

@Override
public void save(ManageAirplanesVO manageAirplanesVO) {
	this.manageAirplanesdao.save(manageAirplanesVO);
	
}

@Override
public List<ManageAirplanesVO> search() {
	
	return this.manageAirplanesdao.search();
}

@Override
public List<ManageAirplanesVO> getByIdManageAirplanes(int id) {

	
	return this.manageAirplanesdao.getByIdManageAirplanes(id);
}

	
	

}
