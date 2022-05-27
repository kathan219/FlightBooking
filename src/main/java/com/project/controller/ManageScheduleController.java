package com.project.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ManageAirplaneTypeVO;
import com.project.model.ManageAirplanesVO;
import com.project.model.ManageAirportVO;
import com.project.model.ManageCityVO;
import com.project.model.ManageScheduleVO;
import com.project.service.ManageAirplanesService;
import com.project.service.ManageAirportService;
import com.project.service.ManageCityService;
import com.project.service.ManageScheduleService;

@Controller
public class ManageScheduleController {

	@Autowired
	private ManageAirplanesService manageAirplanesService;
	@Autowired
	private ManageCityService manageCityService;
	@Autowired
	private ManageAirportService manageAirportService;
	@Autowired
	private ManageScheduleService manageScheduleService;

	@GetMapping("admin/addSchedule")
	public ModelAndView addSchedule() {
		List<ManageAirplanesVO> manageAirplanesList = this.manageAirplanesService.search();
		List<ManageCityVO> manageCityList = this.manageCityService.search();
		List<ManageAirportVO> manageAirportList = this.manageAirportService.search();
		return new ModelAndView("admin/addSchedule", "manageScheduleVO", new ManageScheduleVO())
				.addObject("manageAirplanesList", manageAirplanesList).addObject("manageCityList", manageCityList)
				.addObject("manageAirportList", manageAirportList);

	}

	@PostMapping("admin/saveSchedule")
	public ModelAndView saveSchedule(@ModelAttribute ManageScheduleVO manageScheduleVO, HttpServletRequest request) {

		String[] dayCheckbox = request.getParameterValues("dayCheckbox");
/*		String[] customRadio= request.getParameterValues("customRadio");
*/
		String days = " ";
		/*String routeType=" ";*/
		
		for (int i = 0; i < dayCheckbox.length; i++) {
			days = days + " "+ dayCheckbox[i];
		}
		
/*		for(int i=0; i<customRadio.length;i++){
			routeType=routeType+ " "+customRadio[i];
		}
*/
		manageScheduleVO.setDays(days);
		/*manageScheduleVO.setRouteType(routeType);*/
		
		this.manageScheduleService.save(manageScheduleVO);

		return new ModelAndView("redirect:/admin/addSchedule");

	}

	@GetMapping("admin/viewSchedule")
	public ModelAndView viewSchedule() {

		
		List<ManageScheduleVO> manageScheduleList = this.manageScheduleService.search();
		
		return new ModelAndView("admin/viewSchedule", "manageScheduleList", manageScheduleList);
	}

	@GetMapping("admin/deleteSchedule")
	public ModelAndView deleteSchedule(@ModelAttribute ManageScheduleVO manageScheduleVO, @RequestParam int id) {


		List<ManageScheduleVO> manageScheduleList = this.manageScheduleService.getByIdManageSchedule(id);
		manageScheduleVO = manageScheduleList.get(0);
		manageScheduleVO.setStatus(false);
		this.manageScheduleService.save(manageScheduleVO);
		return new ModelAndView("redirect:/admin/viewSchedule");

	}

	@SuppressWarnings("unused")
	@GetMapping(value = "admin/editSchedule")
	public ModelAndView editSchedule(@ModelAttribute ManageScheduleVO manageScheduleVO,
			@ModelAttribute ManageAirplanesVO manageAirplanesVO, @ModelAttribute ManageCityVO manageCityVO,
			@ModelAttribute ManageAirportVO manageAirportVO, @RequestParam int id, HttpServletRequest request) {
		
	
		
		
		
		List<ManageAirplanesVO> manageAirplanesList = this.manageAirplanesService.search();
		List<ManageCityVO> manageCityList = this.manageCityService.search();
		List<ManageAirportVO> manageAirportList = this.manageAirportService.search();
		
		
		
		manageScheduleVO.setId(id);
		List<ManageScheduleVO> manageScheduleList = this.manageScheduleService.getByIdManageSchedule(id);
		
		manageScheduleVO = manageScheduleList.get(0);
		return new ModelAndView("admin/addSchedule", "manageScheduleVO", manageScheduleVO)
				.addObject("manageAirplanesList", manageAirplanesList).addObject("manageCityList", manageCityList)
				.addObject("manageAirportList", manageAirportList);
	}

	
	
}
