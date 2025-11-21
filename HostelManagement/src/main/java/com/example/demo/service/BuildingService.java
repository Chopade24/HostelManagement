package com.example.demo.service;

import com.example.demo.dto.BuildingDto;
import com.example.demo.entity.Building;

public interface BuildingService {
	
	public void saveBuilding(BuildingDto buildingDto);
	public Building getbuilding(int id);
}
