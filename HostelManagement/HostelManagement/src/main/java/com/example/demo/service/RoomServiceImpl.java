package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RoomDto;
import com.example.demo.entity.Bed;
import com.example.demo.entity.Floor;
import com.example.demo.entity.Hostel;
import com.example.demo.entity.Room;
import com.example.demo.repo.BedRepository;
import com.example.demo.repo.FloorRepository;
import com.example.demo.repo.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	RoomRepository roomRepo;
	
	@Autowired
	BedRepository bedRepo;
	
	@Autowired
	FloorRepository floorRepo;
	
	
	

	
	@Override
	public void saveRoom(RoomDto roomDto) {
		Room room = new Room();
		room.setRoomNo(roomDto.getRoomNo());
		room.setType(roomDto.getType());
		
		
		
		
		Floor f = floorRepo.findById(roomDto.getFloorId()).get();
		room.setFloor(f);
		Room sr = roomRepo.save(room);
		
//		List<Bed> beds = roomDto.getBeds();
//	
//		for(Bed b:beds) {
//			b.setRoom(sr);
//		    bedRepo.save(b);
//		}
	}
	


	@Override
	public Room getRoom(int id) {
		
	    return roomRepo.findById(id).get();
	   
	}
	
	
	
	
	
	
	

	
	
}
