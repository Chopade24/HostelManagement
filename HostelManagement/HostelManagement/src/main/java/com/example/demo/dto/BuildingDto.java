package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Floor;

public class BuildingDto {

	private int noOfFloors;
	private String name;
	private String warden;

	private int hostelId;
	
//	private List<Floor> floors;

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWarden() {
		return warden;
	}

	public void setWarden(String warden) {
		this.warden = warden;
	}

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}

//	public List<Floor> getFloors() {
//		return floors;
//	}
//
//	public void setFloors(List<Floor> floors) {
//		this.floors = floors;
//	}

}
