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

import com.java.net.entity.Theater;
import com.java.net.service.TheaterService;

@Controller
@RestController
@RequestMapping("/theater")
public class ThreaterController {
	
	@Autowired
	private TheaterService theaterService;
	
	@PostMapping("/")
	public Theater createTheater(@RequestBody Theater theater ){
        String responseMessage = "New Theater has been updated to system";
        HttpStatus status = HttpStatus.ACCEPTED;
        Theater theaterobj = theaterService.createTheater(theater);
        System.out.println(theaterobj.getTheaterId());
        System.out.println(theaterobj);
        return theaterobj;
	}
	
	@GetMapping("/{tId}")
	public Theater getTheater(@PathVariable("tId") String theaterId) {
		return theaterService.getTheater(theaterId);
	}
}
