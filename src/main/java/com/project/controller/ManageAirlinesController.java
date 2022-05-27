package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ManageAirlinesVO;
import com.project.service.ManageAirlinesService;

@Controller
public class ManageAirlinesController {
	
	@Autowired
	private ManageAirlinesService manageAirlinesService;
	@GetMapping(value= "admin/addAirlines")
	public ModelAndView addAirlines() {
		
		return new ModelAndView("admin/addAirlines","manageAirlinesVO",new ManageAirlinesVO());
	}
	
	@PostMapping(value= "admin/saveAirlines")
	public ModelAndView saveAirlines(@ModelAttribute ManageAirlinesVO manageAirlinesVO){
		
		 this.manageAirlinesService.save(manageAirlinesVO);
		 return new ModelAndView("redirect:/admin/addAirlines");
	}
	
	@GetMapping(value= "admin/viewAirlines")
	public ModelAndView viewAirlines(){
		List <ManageAirlinesVO> manageAirlinesList=this.manageAirlinesService.search();
		return new ModelAndView("admin/viewAirlines","manageAirlinesList",manageAirlinesList);
	}
	
	@GetMapping(value="admin/deleteAirlines")
	public ModelAndView deleteAirlines(@ModelAttribute ManageAirlinesVO manageAirlinesVO,@RequestParam int id){
		
		List<ManageAirlinesVO> manageAirlinesList=this.manageAirlinesService.getByIdManageAirlines(id);
	
		manageAirlinesVO=manageAirlinesList.get(0);
		manageAirlinesVO.setStatus(false);
		this.manageAirlinesService.save(manageAirlinesVO);
		return new ModelAndView("redirect:/admin/viewAirlines");
		
	}
	
	@GetMapping(value="admin/editAirlines")
	public ModelAndView editAirlines(@ModelAttribute ManageAirlinesVO manageAirlinesVO,@RequestParam int id){
		
		List<ManageAirlinesVO> manageAirlinesList= this.manageAirlinesService.getByIdManageAirlines(id);
		manageAirlinesVO=manageAirlinesList.get(0);
		return new ModelAndView("admin/addAirlines","manageAirlinesVO",manageAirlinesVO).addObject("manageAirlinesList",manageAirlinesList);
		
	}
	
}
