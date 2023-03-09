package com.java.net.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.net.entity.City;
import com.java.net.service.CityService;

@RestController
@RequestMapping("/city")
public class CityController {

	@Autowired
	private CityService cityService;
	
	
	@PostMapping("/")
	public City createCity(@RequestBody City cty){
	
        String responseMessage = "New City updated to system";
        HttpStatus status = HttpStatus.ACCEPTED;
        return cityService.createCity(cty);
	}
	
	@GetMapping("/{cid}")
	public City getCity(@PathVariable("cid") String cityId) {
		return cityService.getCity(cityId);
	}
}
