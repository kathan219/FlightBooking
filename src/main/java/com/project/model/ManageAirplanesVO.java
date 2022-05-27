package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="manageairplanes_table")

public class ManageAirplanesVO {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="manageAirlineVO_id")
	private ManageAirlinesVO manageAirlineVO; 
	
	@ManyToOne
	@JoinColumn(name="manageAirplaneTypeVO_id")
	private ManageAirplaneTypeVO manageAirplaneTypeVO;

	
	@Column(name="airplaneNumber")
	private String airplaneNumber;
	
	@Column(name="airplaneDescription")
	private String airplaneDescription;
	
	@Column(name="airplane_filename")
	private String airplaneFileName;
	
	@Column(name="airplane_filepath")
	private String airplaneFilePath;
	
	@Column(name="status")
	private boolean status=true;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ManageAirlinesVO getManageAirlineVO() {
		return manageAirlineVO;
	}

	public void setManageAirlineVO(ManageAirlinesVO manageAirlineVO) {
		this.manageAirlineVO = manageAirlineVO;
	}

	public ManageAirplaneTypeVO getManageAirplaneTypeVO() {
		return manageAirplaneTypeVO;
	}

	public void setManageAirplaneTypeVO(ManageAirplaneTypeVO manageAirplaneTypeVO) {
		this.manageAirplaneTypeVO = manageAirplaneTypeVO;
	}

	public String getAirplaneNumber() {
		return airplaneNumber;
	}

	public void setAirplaneNumber(String airplaneNumber) {
		this.airplaneNumber = airplaneNumber;
	}

	public String getAirplaneDescription() {
		return airplaneDescription;
	}

	public void setAirplaneDescription(String airplaneDescription) {
		this.airplaneDescription = airplaneDescription;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getAirplaneFileName() {
		return airplaneFileName;
	}

	public void setAirplaneFileName(String airplaneFileName) {
		this.airplaneFileName = airplaneFileName;
	}

	public String getAirplaneFilePath() {
		return airplaneFilePath;
	}

	public void setAirplaneFilePath(String airplaneFilePath) {
		this.airplaneFilePath = airplaneFilePath;
	}

		
}
