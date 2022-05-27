package com.project.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.ManageAirlinesVO;
import com.project.model.ManageAirplaneTypeVO;
import com.project.model.ManageAirplanesVO;
import com.project.service.ManageAirlinesService;
import com.project.service.ManageAirplaneTypeService;
import com.project.service.ManageAirplanesService;

@Controller
public class ManageAirplanesController {

	@Autowired
	public ManageAirlinesService manageAirlinesService;
	@Autowired
	public ManageAirplaneTypeService manageAirplaneTypeService;
	@Autowired
	public ManageAirplanesService manageAirplanesService;

	@GetMapping("admin/addAirplanes")
	public ModelAndView addAirplanes() {
		List<ManageAirlinesVO> manageAirlinesList = this.manageAirlinesService.search();
		List<ManageAirplaneTypeVO> manageAirplaneTypeList = this.manageAirplaneTypeService.search();
		return new ModelAndView("admin/addAirplanes", "manageAirplanesVO", new ManageAirplanesVO())
				.addObject("manageAirlinesList", manageAirlinesList)
				.addObject("manageAirplaneTypeList", manageAirplaneTypeList);
	}

	@PostMapping("admin/saveAirplanes")
	public ModelAndView saveAirplanes(@ModelAttribute ManageAirplanesVO manageAirplanesVO,
			@RequestParam("file") MultipartFile file, HttpSession session) {

		String path = session.getServletContext().getRealPath("/");

		String fileName = file.getOriginalFilename();

		String filePath = path + "document\\airplanes\\";

		try {
			byte barr[] = file.getBytes();

			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(filePath + "/" + fileName));

			bout.write(barr);
			bout.flush();
			bout.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		manageAirplanesVO.setAirplaneFileName(fileName);
		manageAirplanesVO.setAirplaneFilePath(filePath);
		this.manageAirplanesService.save(manageAirplanesVO);
		return new ModelAndView("redirect:/admin/addAirplanes");
	}

	@GetMapping("admin/viewAirplanes")
	public ModelAndView viewAirplanes() {
		List<ManageAirplanesVO> manageAirplanesList = this.manageAirplanesService.search();

		return new ModelAndView("admin/viewAirplanes", "manageAirplanesList", manageAirplanesList);
	}

	@GetMapping("admin/deleteAirplanes")
	public ModelAndView deleteAirplanes(@ModelAttribute ManageAirplanesVO manageAirplanesVO, @RequestParam int id) {

		List<ManageAirplanesVO> manageAirplanesList = this.manageAirplanesService.getByIdManageAirplanes(id);
		manageAirplanesVO = manageAirplanesList.get(0);
		manageAirplanesVO.setStatus(false);
		this.manageAirplanesService.save(manageAirplanesVO);
		return new ModelAndView("redirect:/admin/viewAirplanes");

	}

	@GetMapping(value = "admin/editAirplanes")
	public ModelAndView editAirplanes(@ModelAttribute ManageAirplanesVO manageAirplanesVO,
			@ModelAttribute ManageAirlinesVO manageAirlinesVO,
			@ModelAttribute ManageAirplaneTypeVO manageAirplaneTypeVO, @RequestParam int id) {

		List<ManageAirlinesVO> manageAirlinesList = this.manageAirlinesService.search();
		List<ManageAirplaneTypeVO> manageAirplaneTypeList = this.manageAirplaneTypeService.search();
		manageAirplanesVO.setId(id);
		List<ManageAirplanesVO> manageAirplanesList = this.manageAirplanesService.getByIdManageAirplanes(id);

		manageAirplanesVO = manageAirplanesList.get(0);
		return new ModelAndView("admin/addAirplanes", "manageAirplanesVO", manageAirplanesVO)
				.addObject("manageAirlinesList", manageAirlinesList)
				.addObject("manageAirplaneTypeList", manageAirplaneTypeList);
	}

}
