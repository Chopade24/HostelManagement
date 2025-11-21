package com.example.demo.service;

import org.springframework.http.ResponseEntity;

import com.example.demo.dto.RoomDto;
import com.example.demo.entity.Room;

public interface RoomService {
	
	public void saveRoom(RoomDto roomDto);
	public Room getRoom(int id);

}
