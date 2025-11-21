package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BedDto;
import com.example.demo.entity.Bed;
import com.example.demo.service.BedService;

@RestController
public class BedController {
	
	@Autowired
	BedService bs;
	
	@PostMapping("bed")
	public ResponseEntity saveBed(@RequestBody BedDto bedDto) {
		bs.saveBed(bedDto);
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	@GetMapping("bed/{id}")
	public ResponseEntity getBed(@PathVariable int id) {
		Bed b = bs.getBed(id);
		return new ResponseEntity(b,HttpStatus.OK);
	}
	
	
	@GetMapping("hostel/beds/{hostelId}/{sharing}")
	public ResponseEntity getAvailableBeds(@PathVariable int hostelId,@PathVariable int sharing){
		 List<BedDto> availableBeds = bs.getAvailableBeds(hostelId, sharing);
		 return new ResponseEntity(availableBeds,HttpStatus.OK);
	}


}
