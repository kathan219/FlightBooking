package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.BookingVO;
import com.project.model.LoginVO;
import com.project.model.ManageAirplanesVO;
import com.project.service.LoginService;
import com.project.service.ManageAirplanesService;
import com.project.service.ManageBookingService;

@Controller
public class ManageBookingController {

	@Autowired
	private ManageBookingService manageBookingService;
	
	@Autowired
	private ManageAirplanesService manageAirplanesService;
	
	@Autowired
	private LoginService loginService;
	
	@SuppressWarnings("rawtypes")
	@GetMapping(value = "admin/viewBooking")
	public ModelAndView viewBooking(@ModelAttribute LoginVO loginVO, @ModelAttribute ManageAirplanesVO manageAirplanesVO) {
		
		
		List loginList=this.loginService.search();
		List manageAirplanesList=this.manageAirplanesService.search();
		List bookingList=this.manageBookingService.search();
		System.out.println(bookingList.size());
		
		
	
		
		return new ModelAndView("admin/viewBooking", "bookingList",bookingList).addObject("loginList",loginList).addObject("manageAirplanesList",manageAirplanesList);
	}
	
	
}
