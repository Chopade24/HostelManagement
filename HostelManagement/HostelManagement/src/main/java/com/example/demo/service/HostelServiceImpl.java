package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HostelDto;
import com.example.demo.entity.Building;
import com.example.demo.entity.Hostel;
import com.example.demo.repo.BuildingRepository;
import com.example.demo.repo.HostelRepository;

@Service
public class HostelServiceImpl implements HostelService{
	
	@Autowired
	HostelRepository hostelRepo;
	
	@Autowired
	BuildingRepository buildingRepo;

	@Override
	public void saveHostel(HostelDto hostelDto) {
		Hostel hostel = new Hostel();
		hostel.setName(hostelDto.getName());
		hostel.setAddress(hostelDto.getAddress());
		hostel.setCapacity(hostelDto.getCapacity());
		hostel.setContactNo(hostelDto.getContactNo());
		hostel.setType(hostelDto.getType());
		hostel.setWebsite(hostelDto.getWebsite());
		
		Hostel sh = hostelRepo.save(hostel);
		
//		List<Building> buildings = hostelDto.getBuildings();
//		
//		for(Building b:buildings) {
//			
//			b.setHostel(sh);
//			buildingRepo.save(b);
//		}
		
	}

	@Override
	public Hostel getHostel(int id) {
		
		return hostelRepo.findById(id).get();
	}

	@Override
	public List<Hostel> getHostels() {
		
		return hostelRepo.findAll();
	}

}
