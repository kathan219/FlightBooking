package com.project.dao;

import java.util.List;

import com.project.model.ManageAirplanesVO;

public interface ManageAirplanesDAO {

	void save(ManageAirplanesVO manageAirplanesVO);

	List<ManageAirplanesVO> search();

	List<ManageAirplanesVO> getByIdManageAirplanes(int id);

	

	



}
