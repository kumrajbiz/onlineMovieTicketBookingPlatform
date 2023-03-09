package com.java.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.net.entity.Booking;
import com.java.net.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/")
	public Booking createBooking(@RequestBody Booking book){
        String responseMessage = "New Booking updated to system";
        HttpStatus status = HttpStatus.ACCEPTED;
        return bookingService.createBooking(book);
	}
	
	@GetMapping("/{id}")
	public Booking getBooking(@PathVariable("id") String id) {
		return bookingService.getBooking(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteBooking(@PathVariable("id") String id) {
		bookingService.deleteBooking(id);
        String responseMessage = "Booking "+id+" Deleted from system";
        HttpStatus status = HttpStatus.ACCEPTED;
        return ResponseEntity.status(status).body(responseMessage);
	}
}
