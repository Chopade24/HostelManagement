package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Building;

public class HostelDto {
	
	private String name;
	private String address;
	private int capacity;
	private int contactNo;
	private String type;
	private String website;
	
//	private List<Building> buildings;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

//	public List<Building> getBuildings() {
//		return buildings;
//	}
//
//	public void setBuildings(List<Building> buildings) {
//		this.buildings = buildings;
//	}
//	
//	

}
