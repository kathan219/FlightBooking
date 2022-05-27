package com.project.service;

import java.util.List;

import com.project.model.ManageAirplanesVO;

public interface ManageAirplanesService {

	void save(ManageAirplanesVO manageAirplanesVO);

	List<ManageAirplanesVO> search();

	List<ManageAirplanesVO> getByIdManageAirplanes(int id);

	

}
