package com.example.demo.dto;

import java.time.LocalDate;

public class UserDto {
	
	private String name;
	private String currentAddress;
	private String permanentAddress;
	private LocalDate DOB;
	private String email;
	private String mobNo;
	private String adharNo;
	private String education;
	private String parentName;
	private String parentMobNo;
//    private int bookingId;
    
    

//	public int getBookingId() {
//		return bookingId;
//	}
//
//	public void setBookingId(int bookingId) {
//		this.bookingId = bookingId;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getParentMobNo() {
		return parentMobNo;
	}

	public void setParentMobNo(String parentMobNo) {
		this.parentMobNo = parentMobNo;
	}

	
	
	

}
