
package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.BedDto;
import com.example.demo.entity.Bed;

public interface BedService {
	
	public void saveBed(BedDto bedDto);
	public Bed getBed(int id);
//	public List<Bed> getAllBed();
	
	public List<BedDto> getAvailableBeds(int hostelId,int sharing);
//	List<BedDto> getAvailableBedsByHostelId(int hostelId, int sharing);

}
