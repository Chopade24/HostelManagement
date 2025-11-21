package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RoomDto;
import com.example.demo.entity.Room;
import com.example.demo.service.RoomService;

@RestController
public class RoomController {
	
	@Autowired
	RoomService rs;

	@PostMapping("room")
	public ResponseEntity saveRoom(@RequestBody RoomDto roomDto) {
		rs.saveRoom(roomDto);
		return new ResponseEntity(HttpStatus.CREATED);		
	}
	
	@GetMapping("room/{id}")
	public ResponseEntity getRoom(@PathVariable int id) {
		Room r = rs.getRoom(id);
		return new ResponseEntity(r,HttpStatus.OK);
	}
	
}
