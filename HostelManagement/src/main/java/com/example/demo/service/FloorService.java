package com.example.demo.service;

import com.example.demo.dto.FloorDto;
import com.example.demo.entity.Floor;

public interface FloorService {
	
	public void saveFloor(FloorDto floorDto);
	public Floor getFloor(int id);

}
