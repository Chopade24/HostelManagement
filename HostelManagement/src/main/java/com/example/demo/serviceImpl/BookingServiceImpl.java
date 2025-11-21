package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BookingDto;
import com.example.demo.entity.Bed;
import com.example.demo.entity.Booking;
import com.example.demo.entity.User;
import com.example.demo.repo.BedRepository;
import com.example.demo.repo.BookingRepository;
import com.example.demo.repo.UserRepository;
import com.example.demo.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingRepository bookRepo;
	
	@Autowired
	BedRepository bedRepo;
	
	@Autowired
	UserRepository userRepo;

	@Override
	public void saveBooking(BookingDto bookingDto) {
		
		User user = userRepo.findById(bookingDto.getUserId()).get();
		Bed bed = bedRepo.findById(bookingDto.getBedId()).get();
		
		Booking booking = new Booking();
		booking.setBookingStatus(bookingDto.getBookingStatus());
		booking.setDate(bookingDto.getDate());
		booking.setPaymentStatus(bookingDto.getPaymentStatus());
		
		booking.setBed(bed);
		booking.setUser(user);
		
		bookRepo.save(booking);
	
		
	}

	@Override
	public Booking getBooking(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
