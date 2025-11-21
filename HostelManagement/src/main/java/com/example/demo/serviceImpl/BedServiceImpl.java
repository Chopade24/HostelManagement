package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BedDto;
import com.example.demo.entity.Bed;
import com.example.demo.entity.Room;
import com.example.demo.entity.User;
import com.example.demo.repo.BedRepository;
import com.example.demo.repo.BookingRepository;
import com.example.demo.repo.RoomRepository;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.BedService;

@Service
public class BedServiceImpl implements BedService{
    @Autowired
	BedRepository bedRepo;
    
    @Autowired
    RoomRepository roomRepo;
    
    @Autowired
    BookingRepository bookRepo;
    
    @Autowired
    UserRepository userRepo;

	@Override
	public void saveBed(BedDto bedDto) {
		Bed bed = new Bed();
		bed.setBedNo(bedDto.getBedNo());
		bed.setStatus(bedDto.getStatus());
		bed.setPrice(bedDto.getPrice());
		bed.setSharing(bedDto.getSharing());
		
		
		Room room = roomRepo.findById(bedDto.getRoomId()).get();
		bed.setRoom(room);
		
		
		
		User user = userRepo.findById(bedDto.getUserId()).get();
		user.setBed(bed);;
		userRepo.save(user);

		
		List<Bed> beds = bedRepo.findByRoom_Id(bedDto.getRoomId());
		int count = 0;
		
		for(Bed b : beds) {
			count++;
		}
		room.setNoOfBeds(count);
		roomRepo.save(room);
		
		
		
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

//	    public List<BedDto> getAvailableBeds(int hostelId, int sharing) {
//	        List<Bed> beds = bedRepo.findAvailableBeds(hostelId, sharing);
//
//	        return beds.stream()
//	                .map(bed -> {
//	                    BedDto dto = new BedDto();
//	                    dto.setBedNo(bed.getBedNo());
//	                    dto.setStatus(bed.getStatus());
//	                    dto.setPrice(bed.getPrice());
//	                    dto.setRoomId(bed.getRoom().getId());
//	                    dto.setSharing(bed.getSharing());
//	                    dto.setFloorNo(bed.getRoom().getFloor().getFloorNo());
//	                    dto.setBuildingName(bed.getRoom().getFloor().getBuilding().getName());
//	                    dto.setHostelName(bed.getRoom().getFloor().getBuilding().getHostel().getName());
//	                    dto.setRoomNo(bed.getRoom().getRoomNo());
//	                    return dto;
//	                })
//	                .collect(Collectors.toList());
//	        
//	    }
	    
//	    
	    public List<BedDto> getAvailableBeds(int hostelId, int sharing) {

	        List<Bed> beds = bedRepo.findAvailableBeds(hostelId, sharing);
	        
	        List<BedDto> dtoList = new ArrayList<BedDto>(); 

	        for (Bed bed : beds) {

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

	            dtoList.add(dto);
	        }
	        

	        return dtoList;
	    }

	
	    
	    

	

	
}

