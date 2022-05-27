package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ManageScheduleDAO;
import com.project.model.ManageScheduleVO;

@Service
@Transactional
public class ManageScheduleServiceImpl implements ManageScheduleService{

	@Autowired
	private ManageScheduleDAO manageScheduleDao;
	@Override
	public void save(ManageScheduleVO manageScheduleVO) {
		this.manageScheduleDao.save(manageScheduleVO);
	}

	@Override
	public List<ManageScheduleVO> search() {
		
		
		return this.manageScheduleDao.search();
	}

	@Override
	public List<ManageScheduleVO> getByIdManageSchedule(int id) {

		return this.manageScheduleDao.getByIdManageSchedule(id);
	}

}
