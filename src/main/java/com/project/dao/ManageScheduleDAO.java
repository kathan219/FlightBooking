package com.project.dao;

import java.util.List;

import com.project.model.ManageScheduleVO;

public interface ManageScheduleDAO {

	void save(ManageScheduleVO manageScheduleVO);

	List<ManageScheduleVO> search();

	List<ManageScheduleVO> getByIdManageSchedule(int id); 
}
