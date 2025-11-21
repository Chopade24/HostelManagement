package com.example.demo.service;


import com.example.demo.dto.BookingDto;
import com.example.demo.entity.Booking;

public interface BookingService {
	
	public void saveBooking(BookingDto bookingDto);
	public Booking getBooking(int id);

}
