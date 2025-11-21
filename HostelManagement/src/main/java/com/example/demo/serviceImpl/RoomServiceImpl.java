package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RoomDto;
import com.example.demo.entity.Floor;
import com.example.demo.entity.Room;
import com.example.demo.repo.BedRepository;
import com.example.demo.repo.FloorRepository;
import com.example.demo.repo.RoomRepository;
import com.example.demo.service.RoomService;

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
		room.setNoOfBeds(0);	
		
		Floor f = floorRepo.findById(roomDto.getFloorId()).get();
		room.setFloor(f);
		Room sr = roomRepo.save(room);
		
		List<Room> rooms = roomRepo.findByFloor_Id(roomDto.getFloorId());
		int count = 0;
		for(Room r : rooms) {
			count++;
		}
		f.setNoOfRooms(count);
		floorRepo.save(f);
		
	}
	
	


	@Override
	public Room getRoom(int id) {
		
	    return roomRepo.findById(id).get();
	   
	}
	
}
	
	
	
	
	

	
	

