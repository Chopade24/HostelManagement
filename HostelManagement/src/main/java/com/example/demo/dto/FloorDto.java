package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Room;

public class FloorDto {
	
	private int floorNo;
	private int noOfRooms;
	
	private int buildingId;
//	private List<Room> rooms;
	

	public int getFloorNo() {
		return floorNo;
	}
	public void setFloorNo(int floorNo) {
		this.floorNo = floorNo;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public int getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}
//	public List<Room> getRooms() {
//		return rooms;
//	}
//	public void setRooms(List<Room> rooms) {
//		this.rooms = rooms;
//	}
	
	
	

}
