package com.java.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.net.entity.Seat;
import com.java.net.repository.SeatRepository;

@Service
public class SeatService {

	@Autowired
	private SeatRepository seatRepository;
	
	public Seat createSeat(Seat seat) {
		return seatRepository.save(seat);
	}
	
	
	public Seat getSeat(String sid) {
		return seatRepository.findBySeatId(sid);
	}
	
	
}
