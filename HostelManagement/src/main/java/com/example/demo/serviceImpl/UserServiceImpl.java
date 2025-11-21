package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.Bed;
import com.example.demo.entity.User;
import com.example.demo.repo.BedRepository;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	BedRepository bedRepo;
	
	@Override
	public void saveUser(UserDto userDto) {
		User user = new User();
		user.setName(userDto.getName());
		user.setAdharNo(userDto.getAdharNo());
		user.setCurrentAddress(userDto.getCurrentAddress());
		user.setDOB(userDto.getDOB());
		user.setPermanentAddress(userDto.getPermanentAddress());
		user.setEducation(userDto.getEducation());
		user.setEmail(userDto.getEmail());
		user.setMobNo(userDto.getMobNo());
		user.setParentMobNo(userDto.getParentMobNo());
		user.setParentName(userDto.getParentName());
		user.setParentMobNo(userDto.getParentMobNo());

		
		userRepo.save(user);
		
		
		
	}

}
