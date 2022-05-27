package com.project.dao;



import java.util.List;

import com.project.model.ManageAirportVO;
public interface ManageAirportDAO {

	void save(ManageAirportVO manageAirportVO);

	List<ManageAirportVO> search();

	List<ManageAirportVO> getByIdManageAirport(int id);
	
	
}
