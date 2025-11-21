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

import com.example.demo.dto.HostelDto;
import com.example.demo.entity.Hostel;
import com.example.demo.service.HostelService;

@RestController
public class HostelController {
    @Autowired
	HostelService hs;
    
    @PostMapping("hostel")
    public ResponseEntity saveHostel(@RequestBody HostelDto hostelDto) {
    	     hs.saveHostel(hostelDto);
    	     return new ResponseEntity(HttpStatus.CREATED);
    }
    
    
    
	@GetMapping("hostel/{id}")
    public ResponseEntity getHostel(@PathVariable int id) {
    	    Hostel h= hs.getHostel(id);
    	    return new ResponseEntity(h,HttpStatus.OK);
    }
	
	
	@GetMapping("hostels")
	public ResponseEntity getHostels() {
	 List<Hostel> lh = 	hs.getHostels();
	 return new ResponseEntity(lh,HttpStatus.OK);
	}
	
	
	
	
}
