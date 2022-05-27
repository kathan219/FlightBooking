package com.project.service;

import java.util.List;

import com.project.model.ManageAirlinesVO;

public interface ManageAirlinesService {

	void save(ManageAirlinesVO manageAirlinesVO);

	List<ManageAirlinesVO> search();

	List<ManageAirlinesVO> getByIdManageAirlines(int id);

}
