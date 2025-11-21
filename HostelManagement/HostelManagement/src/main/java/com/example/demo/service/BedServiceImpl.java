package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BedDto;
import com.example.demo.entity.Bed;
import com.example.demo.entity.Building;
import com.example.demo.entity.Floor;
import com.example.demo.entity.Room;
import com.example.demo.repo.BedRepository;
import com.example.demo.repo.RoomRepository;

@Service
public class BedServiceImpl implements BedService{
    @Autowired
	BedRepository bedRepo;
    
    @Autowired
    RoomRepository roomRepo;

	@Override
	public void saveBed(BedDto bedDto) {
		Bed bed = new Bed();
		bed.setBedNo(bedDto.getBedNo());
		bed.setStatus(bedDto.getStatus());
		bed.setPrice(bedDto.getPrice());
		bed.setSharing(bedDto.getSharing());
		
		
		Room r = roomRepo.findById(bedDto.getRoomId()).get();
		bed.setRoom(r);
		Bed bs = bedRepo.save(bed);
		
	}

	@Override
	public Bed getBed(int id) {
		// TODO Auto-generated method stub
		return bedRepo.findById(id).get();
	}

//	@Override
//	public List<BedDto> getAvailableBedsByHostelId(int hostelId, int sharing) {
//     
//	List<BedDto> listBedDto = new ArrayList();
//	List<Bed> beds =  bedRepo.getAvailableBeds(hostelId, sharing);
//	for(Bed b : beds) {
//		
//		Room room = b.getRoom();
//		Floor floor = room.getFloor();
//		Building building = floor.getBuilding();
//		
//		BedDto dto = new BedDto();
//		dto.setRoomNo(room.getRoomNo());
//		dto.setFloorNo(floor.getFloorNo());
//		dto.setBuildingName(building.getName());
//		dto.setHostelName(building.getHostel().getName());
//	    listBedDto.add(dto);
//	    
//	}
//		
//	return listBedDto;
//	}
//	

	    public List<BedDto> getAvailableBeds(int hostelId, int sharing) {
	        List<Bed> beds = bedRepo.getAvailableBeds(hostelId, sharing);

	        return beds.stream()
	                .map(bed -> {
	                    BedDto dto = new BedDto();
	                    dto.setBedNo(bed.getBedNo());
	                    dto.setStatus(bed.getStatus());
	                    dto.setPrice(bed.getPrice());
	                    dto.setRoomId(bed.getRoom().getId());
	                    dto.setSharing(bed.getSharing());
	                    dto.setFloorNo(bed.getRoom().getFloor().getFloorNo());
	                    dto.setBuildingName(bed.getRoom().getFloor().getBuilding().getName());
	                    dto.setHostelName(bed.getRoom().getFloor().getBuilding().getHostel().getName());
	                    dto.setRoomNo(bed.getRoom().getRoomNo());
	                    return dto;
	                })
	                .collect(Collectors.toList());
	        
	    }
	    
//	    
	
	
	    
	    

	

	
}

