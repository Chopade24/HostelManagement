package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.HostelDto;
import com.example.demo.entity.Hostel;

public interface HostelService {
	
	public void saveHostel(HostelDto hostelDto);
	public Hostel getHostel(int id);
	public List<Hostel> getHostels();

}
