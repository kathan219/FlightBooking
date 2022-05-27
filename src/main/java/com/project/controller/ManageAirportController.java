package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ManageAirplaneTypeVO;
import com.project.model.ManageAirportVO;
import com.project.model.ManageCityVO;
import com.project.service.ManageAirportService;
import com.project.service.ManageCityService;

@Controller
public class ManageAirportController {
	
	@Autowired 
	private ManageCityService manageCityService;
	@Autowired 
	private ManageAirportService manageAirportService;
	@GetMapping("admin/addAirport")
	public ModelAndView addAirport() {
		
		List<ManageCityVO> manageCityList=this.manageCityService.search();
		
		return new ModelAndView("admin/addAirport","manageAirportVO",new ManageAirportVO()).addObject("manageCityList",manageCityList);
	}
	
	@PostMapping(value="admin/saveAirport")
	public ModelAndView saveAirport(@ModelAttribute ManageAirportVO manageAirportVO)
	{
		this.manageAirportService.save(manageAirportVO);
		return new ModelAndView("redirect:/admin/addAirport");
	}

	@GetMapping(value= "admin/viewAirport")
	public ModelAndView viewAirport(){
		
		List <ManageAirportVO> manageAirportList=this.manageAirportService.search();
		return new ModelAndView("admin/viewAirport","manageAirportList",manageAirportList);
	}
	
	@GetMapping(value= "admin/deleteAirport")
	public ModelAndView deleteAirport(@ModelAttribute ManageAirportVO manageAirportVO,@RequestParam int id){
	
		List<ManageAirportVO> manageAirportList= this.manageAirportService.getByIdManageAirport(id);
		System.out.println(manageAirportList.size());
		manageAirportVO=manageAirportList.get(0);
		manageAirportVO.setStatus(false);
		this.manageAirportService.save(manageAirportVO);
		return new ModelAndView("redirect:/admin/viewAirport");
		
	}
	
	@GetMapping(value= "admin/editAirport")
	public ModelAndView editAirport(@ModelAttribute ManageAirportVO manageAirportVO,@ModelAttribute ManageCityVO manageCityVO,@RequestParam int id){
		
	
		List<ManageCityVO> manageCityList= this.manageCityService.search();
		
		manageAirportVO.setId(id);
		List<ManageAirportVO> manageAirportList= this.manageAirportService.getByIdManageAirport(id);
		
		manageAirportVO= manageAirportList.get(0);
		return new ModelAndView("admin/addAirport","manageAirportVO",manageAirportVO).addObject("manageCityList",manageCityList);
	}
	

}
