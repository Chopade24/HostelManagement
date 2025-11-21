package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BuildingDto;
import com.example.demo.entity.Building;
import com.example.demo.service.BuildingService;

@RestController
public class BuildingController {

	@Autowired
	BuildingService bs;

	@PostMapping("building")
	public ResponseEntity saveBuilding(@RequestBody BuildingDto buildingDto) {
		bs.saveBuilding(buildingDto);
		return new ResponseEntity(HttpStatus.CREATED);

	}

	@GetMapping("building/{id}")
	public ResponseEntity getBuilding(@PathVariable int id) {
		Building b = bs.getbuilding(id);
		return new ResponseEntity(b, HttpStatus.OK);
	}

}
