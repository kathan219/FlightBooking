package com.project.service;

import java.util.List;

import com.project.model.ManageScheduleVO;

public interface ManageScheduleService {

	void save(ManageScheduleVO manageScheduleVO);

	List<ManageScheduleVO> search();

	List<ManageScheduleVO> getByIdManageSchedule(int id);

}
