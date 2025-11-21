package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrganizationDto;
import com.example.demo.entity.Organization;
import com.example.demo.service.OrganizationService;

@RestController
public class OrganizationController {
	
	@Autowired
	OrganizationService os;
	
	@PostMapping("organization")
	public ResponseEntity saveOrganization(@RequestBody OrganizationDto organizationDto) {
		
		 os.saveOrganization(organizationDto);
		
		return new ResponseEntity(HttpStatus.CREATED);
	}
	
	
	@GetMapping("organization/{organizationId}")
	public ResponseEntity getOrganization(@PathVariable int organizationId) {
		Organization org = os.getOrganization(organizationId);
		return new ResponseEntity(org,HttpStatus.OK);
		
	}

}
