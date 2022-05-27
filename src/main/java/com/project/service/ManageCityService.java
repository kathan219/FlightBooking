package com.project.service;
import java.util.List;

import com.project.model.ManageCityVO;

public interface ManageCityService {

	void save(ManageCityVO manageCityVO);

	List<ManageCityVO> search();

	

	List<ManageCityVO> getByIdManageCity(int id);

}
