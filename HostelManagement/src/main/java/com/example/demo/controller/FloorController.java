package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.FloorDto;
import com.example.demo.entity.Floor;
import com.example.demo.service.FloorService;

@RestController
public class FloorController {
	
	@Autowired
	FloorService fs;
	
	@PostMapping("floor")
	public ResponseEntity saveFloor(@RequestBody FloorDto floorDto) {
		fs.saveFloor(floorDto);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	
	@GetMapping("floor/{id}")
	public ResponseEntity getFloor(@PathVariable int id) {
	
	  Floor f = fs.getFloor(id);
	  return new ResponseEntity(f,HttpStatus.OK);
	}

}
