package com.project.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ManageAirportDAO;
import com.project.model.ManageAirportVO;

@Service
@Transactional
public class ManageAirportServiceImpl implements ManageAirportService {

@Autowired
private ManageAirportDAO manageAirportDao;
@Override
public void save(ManageAirportVO manageAirportVO){
		
		this.manageAirportDao.save(manageAirportVO);
		
	}
@Override
public List<ManageAirportVO> search() {
	
	return this.manageAirportDao.search();
}
@Override
public List<ManageAirportVO> getByIdManageAirport(int id) {

	return this.manageAirportDao.getByIdManageAirport(id);
}

}
