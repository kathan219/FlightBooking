package com.project.service;



import java.util.List;

import com.project.model.ManageAirportVO;


public interface ManageAirportService {

	
		void save(ManageAirportVO manageAirportVO);

		List<ManageAirportVO> search();

		List<ManageAirportVO> getByIdManageAirport(int id);
		
}
