package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BreakdownDto;
import com.example.demo.entity.Bed;
import com.example.demo.repo.BedRepository;
import com.example.demo.service.BreakdownService;



@Service
public class BreakdownServiceImpl implements BreakdownService{
	
	@Autowired
	BedRepository bedRepo;
    
    
	@Override
	public BreakdownDto getBreakdown(int bedId, int duration) {
		
		Bed bed = bedRepo.findById(bedId).get();
		
		int p = bed.getPrice();
		
		BreakdownDto breakdownDto = new BreakdownDto();
		breakdownDto.setFinalAmount(duration*p);
		breakdownDto.setBedNo(bed.getBedNo());
		breakdownDto.setRoomNo(bed.getRoom().getRoomNo());
		breakdownDto.setFloorNo(bed.getRoom().getFloor().getFloorNo());
		breakdownDto.setBuildingNo(bed.getRoom().getFloor().getBuilding().getId());
		breakdownDto.setHostelName(bed.getRoom().getFloor().getBuilding().getHostel().getName());
		
		
		return breakdownDto;
		
		
	}

	
}
