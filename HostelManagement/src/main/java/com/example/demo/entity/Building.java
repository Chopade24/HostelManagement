package com.example.demo.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Building {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Integer noOfFloors;
	private String name;
	private String warden;
	
	@ManyToOne
	@JoinColumn(name="hostelId",referencedColumnName = "id")
	@JsonBackReference
	private Hostel hostel;

	@OneToMany(mappedBy = "building")
	private List<Floor> floors;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public Hostel getHostel() {
		return hostel;
	}


	public void setHostel(Hostel hostel) {
		this.hostel = hostel;
	}


	public List<Floor> getFloors() {
		return floors;
	}

	public void setFloors(List<Floor> floors) {
	    this.floors = floors;
  }
	
	
}
