package com.java.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.net.dto.MyObject;
import com.java.net.service.MyService;

@RestController
@RequestMapping("/updatedetails")
public class MyController {
	
	@Autowired
	private MyObject myObject;
	
	@Autowired
	private MyService myService;
	
	@PostMapping("/")
	public String postMovie(@RequestBody MyObject incomingRequest) {
		myService.createDetails(incomingRequest);
        String responseMessage = "New Movie has been updated to system By SingleRequest";
        HttpStatus status = HttpStatus.ACCEPTED;
        return responseMessage;
	}

}
