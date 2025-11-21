package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.FloorDto;
import com.example.demo.entity.Building;
import com.example.demo.entity.Floor;
import com.example.demo.entity.Room;
import com.example.demo.repo.BuildingRepository;
import com.example.demo.repo.FloorRepository;
import com.example.demo.repo.RoomRepository;

@Service
public class FloorServiceImpl implements FloorService{
	
	@Autowired
	FloorRepository floorRepo;
	
	@Autowired
	RoomRepository roomRepo;
	
	@Autowired
	BuildingRepository buildRepo;

	@Override
	public void saveFloor(FloorDto floorDto) {
		Floor floor = new Floor();
		floor.setFloorNo(floorDto.getFloorNo());
		floor.setNoOfRooms(floorDto.getNoOfRooms());
	
	
	
	Building b  = buildRepo.findById(floorDto.getBuildingId()).get();
	
	floor.setBuilding(b);
	Floor sf = floorRepo.save(floor);
	
	
	
//	List<Room> rooms = floorDto.getRooms();
//	for(Room r:rooms) {
//		r.setFloor(sf);
//		roomRepo.save(r);
//		
//	}
	
	
		
	}

	@Override
	public Floor getFloor(int id) {
		
		return floorRepo.findById(id).get();
	}

}
