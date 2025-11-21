package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OrganizationDto;
import com.example.demo.entity.Organization;
import com.example.demo.repo.OrganizationRepository;
import com.example.demo.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService{
	
	@Autowired
	OrganizationRepository orgRepo;

	@Override
	public void saveOrganization(OrganizationDto organizationDto) {
		
		Organization o = new Organization();
		o.setAddress(organizationDto.getAddress());
		o.setContactNo(organizationDto.getContactNo());
		o.setName(organizationDto.getName());
		o.setNoOfHostel(0);
		
		
		
		
		orgRepo.save(o);
	}

	@Override
	public Organization getOrganization(int id) {
		// TODO Auto-generated method stub
		return orgRepo.findById(id).get();
	}

}
