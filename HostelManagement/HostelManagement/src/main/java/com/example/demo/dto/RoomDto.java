package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.Bed;

public class RoomDto {
	
	private int roomNo;
	private String type;
	private int floorId;
//	private List<Bed> beds;
	
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
//	public List<Bed> getBeds() {
//		return beds;
//	}
//	public void setBeds(List<Bed> beds) {
//		this.beds = beds;
//	}
//	
	

}
