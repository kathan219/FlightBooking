package com.project.dao;

import java.util.List;

import com.project.model.ManageCityVO;

public interface ManageCityDAO {
	
	void save (ManageCityVO manageCityVO);
	List<ManageCityVO> search();
	List<ManageCityVO> getByIdManageCity(int id);

	

}
