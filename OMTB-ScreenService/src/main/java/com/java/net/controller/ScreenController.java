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

import com.java.net.entity.Screen;
import com.java.net.service.ScreenService;

@Controller
@RestController
@RequestMapping("/screen")
public class ScreenController {

	@Autowired
	private ScreenService screenService;
	
	@PostMapping("/")
	public Screen createScreen(@RequestBody Screen screen){
		
        String responseMessage = "New Screen has been updated to system for theater";
        HttpStatus status = HttpStatus.ACCEPTED;
        return screenService.createScreen(screen);
	}
	
	@GetMapping("/{sid}")
	public Screen getScreen(@PathVariable("sid") String sid) {
		return screenService.getScreen(sid);
	}
	
}
