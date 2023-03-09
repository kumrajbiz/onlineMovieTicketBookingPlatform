package com.java.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.net.entity.Seat;
import com.java.net.service.SeatService;

@Controller
@RestController
@RequestMapping("/seat")
public class SeatController {

	@Autowired
	private SeatService screenService;
	
	@PostMapping("/")
	public Seat createSeat(@RequestBody Seat seat){
		
        String responseMessage = "New Seat has been updated to Screen for show";
        HttpStatus status = HttpStatus.ACCEPTED;
        return screenService.createSeat(seat);
	}
	
	@GetMapping("/{sid}")
	public Seat getSeat(@PathVariable("sid") String sid) {
		Seat s= screenService.getSeat(sid);
		return s;
	}
	
}
