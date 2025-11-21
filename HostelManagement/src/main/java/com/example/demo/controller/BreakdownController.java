package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BreakdownDto;
import com.example.demo.service.BreakdownService;

@RestController
public class BreakdownController {
	
	@Autowired
	BreakdownService bs;
	
	@GetMapping("breakdown/{bedId}/{duration}")
	public ResponseEntity getBreakdown(@PathVariable int bedId,@PathVariable int duration) {
		
		BreakdownDto breakDto = bs.getBreakdown(bedId, duration);
		return new ResponseEntity(breakDto,HttpStatus.OK);
	}

}
