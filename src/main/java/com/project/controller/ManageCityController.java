package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ManageCityVO;
import com.project.service.ManageCityService;

@Controller
public class ManageCityController {

	@Autowired
	private ManageCityService manageCityService;

	@GetMapping(value = "admin/addCity")
	public ModelAndView addCity() {

		return new ModelAndView("admin/addCity", "manageCityVO", new ManageCityVO());
	}

	@PostMapping(value = "admin/saveCity")
	public ModelAndView saveCity(@ModelAttribute ManageCityVO manageCityVO) {
		this.manageCityService.save(manageCityVO);
		return new ModelAndView("redirect:/admin/addCity");
	}

	@GetMapping(value = "admin/viewCity")
	public ModelAndView viewCity() {
		List<ManageCityVO> manageCityList = this.manageCityService.search();
		return new ModelAndView("admin/viewCity", "manageCityList", manageCityList);
	}

	@GetMapping(value = "admin/deleteCity")
	public ModelAndView deleteCity(@ModelAttribute ManageCityVO manageCityVO, @RequestParam int id) {
		List<ManageCityVO> manageCityList = this.manageCityService.getByIdManageCity(id);
		manageCityVO = manageCityList.get(0);
		manageCityVO.setStatus(false);
		
		this.manageCityService.save(manageCityVO);
		return new ModelAndView("redirect:/admin/viewCity");
	}

	@GetMapping(value = "admin/editCity")
	public ModelAndView editCity(@ModelAttribute ManageCityVO manageCityVO, @RequestParam int id) {

		List<ManageCityVO> manageCityList = this.manageCityService.getByIdManageCity(id);
		
		manageCityVO= manageCityList.get(0);
		return new ModelAndView("admin/addCity", "manageCityVO", manageCityVO).addObject("manageCityList",manageCityList);

	}
	

	
	
}