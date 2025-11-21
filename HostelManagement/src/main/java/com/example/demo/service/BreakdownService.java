package com.example.demo.service;

import com.example.demo.dto.BreakdownDto;

public interface BreakdownService {
	
	public BreakdownDto getBreakdown(int bedId,int duration);

}
