package com.project.dao;

import java.util.List;

import com.project.model.ManageAirlinesVO;

public interface ManageAirlinesDAO {

	void save(ManageAirlinesVO manageAirlinesVO);

	List<ManageAirlinesVO> search();

	

	List<ManageAirlinesVO> getByIdManageAirlines(int id);

}
