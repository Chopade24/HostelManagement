package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.HostelDto;
import com.example.demo.entity.Hostel;
import com.example.demo.entity.Organization;
import com.example.demo.repo.BuildingRepository;
import com.example.demo.repo.HostelRepository;
import com.example.demo.repo.OrganizationRepository;
import com.example.demo.service.HostelService;

@Service
public class HostelServiceImpl implements HostelService{
	
	@Autowired
	HostelRepository hostelRepo;
	
	@Autowired
	BuildingRepository buildingRepo;
	
	@Autowired
	OrganizationRepository orgRepo;

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
		
		Organization organization = orgRepo.findById(hostelDto.getOrganizationId()).get();
		hostel.setOrganization(organization);
		hostelRepo.save(hostel);
		
			List<Hostel> hostels = hostelRepo.findHostelByOrganization_Id(hostelDto.getOrganizationId());
			int count = 0;
			for(Hostel h:hostels) {
				count++;
			}
			
			organization.setNoOfHostel(count);
			orgRepo.save(organization);
		
		
		
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
