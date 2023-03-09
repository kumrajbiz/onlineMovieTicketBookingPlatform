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

import com.java.net.entity.User;
import com.java.net.service.UserService;

@Controller
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User createUser(@RequestBody User usr){
        String responseMessage = "New User has been updated to system";
        HttpStatus status = HttpStatus.ACCEPTED;
        return userService.createUser(usr);
	}

	
	@GetMapping("/{id}")
	public User getuser(@PathVariable("id") String userId) {
		return userService.getUser(userId);
	}
}
