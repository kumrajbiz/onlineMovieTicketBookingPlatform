package com.java.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.net.entity.Booking;
import com.java.net.exception.BookingException;
import com.java.net.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;
	
	
	public Booking createBooking(Booking book) {
		return bookingRepository.save(book);
	}
	
	public Booking getBooking(String bid) {
		return bookingRepository.getReferenceById(bid);
	}
	
	public boolean deleteBooking(String bid) {
		try {
			bookingRepository.deleteById(bid);
		} catch (Exception e) {
			return false;
		}
		return true;
		
	}
}
