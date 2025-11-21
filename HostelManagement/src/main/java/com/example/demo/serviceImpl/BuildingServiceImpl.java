package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BuildingDto;
import com.example.demo.entity.Building;
import com.example.demo.entity.Hostel;
import com.example.demo.repo.BuildingRepository;
import com.example.demo.repo.FloorRepository;
import com.example.demo.repo.HostelRepository;
import com.example.demo.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	BuildingRepository buildingRepo;

	@Autowired
	FloorRepository floorRepo;
	
	@Autowired
	HostelRepository hostelRepo;
                               
	@Override
	public void saveBuilding(BuildingDto buildingDto) {

		Building building = new Building();
		building.setName(buildingDto.getName());
		building.setNoOfFloors(0);
		building.setWarden(buildingDto.getWarden());

		
		
       Hostel h = hostelRepo.findById(buildingDto.getHostelId()).get();
            building.setHostel(h);
            Building bs = buildingRepo.save(building);
            
       
//		List<Floor> floors = buildingDto.getFloors();
//
//		for (Floor f : floors) {
//			f.setBuilding(bs);
//			floorRepo.save(f);
//		}
//	}
            
                  

	}
	@Override
	public Building getbuilding(int id) {

		return buildingRepo.findById(id).get();
	}

}
