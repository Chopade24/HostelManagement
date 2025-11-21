package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookingDto;
import com.example.demo.service.BookingService;

@RestController
public class BookingController {
	
	@Autowired
	BookingService bs;
	
	@PostMapping("booking")
	public ResponseEntity addBooking(@RequestBody BookingDto bookingDto) {
		
		bs.saveBooking(bookingDto);
		return new ResponseEntity(HttpStatus.CREATED);
	}

}
