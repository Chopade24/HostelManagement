package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Organization {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	private int noOfHostel;
	private int contactNo;
	
	@OneToMany(mappedBy = "organization")
	List<Hostel> hostels;

	
	public List<Hostel> getHostels() {
		return hostels;
	}
	public void setHostels(List<Hostel> hostels) {
		this.hostels = hostels;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getNoOfHostel() {
		return noOfHostel;
	}
	public void setNoOfHostel(int noOfHostel) {
		this.noOfHostel = noOfHostel;
	}
	public int getContactNo() {
		return contactNo;
	}
	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}
	
	
	

}
