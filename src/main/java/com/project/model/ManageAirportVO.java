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
@Table(name = "manageairport_table")
public class ManageAirportVO {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "airportName")
	private String airportName;

	
	@ManyToOne
	@JoinColumn(name="manageCityVO_id")
	private ManageCityVO manageCityVO;
	

	@Column(name = "airportType")
	private String airportType;
	
	@Column(name = "airportDescription")
	private String airportDescription;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public ManageCityVO getManageCityVO() {
		return manageCityVO;
	}

	public void setManageCityVO(ManageCityVO manageCityVO) {
		this.manageCityVO = manageCityVO;
	}

	public String getAirportType() {
		return airportType;
	}

	public void setAirportType(String airportType) {
		this.airportType = airportType;
	}

	public String getAirportDescription() {
		return airportDescription;
	}

	public void setAirportDescription(String airportDescription) {
		this.airportDescription = airportDescription;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Column(name="status")
	private boolean status=true;


}
