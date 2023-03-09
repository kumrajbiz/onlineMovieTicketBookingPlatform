package com.java.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.net.entity.City;
import com.java.net.repository.CityRepository;

@Service
public class CityService {

	
	@Autowired
	private CityRepository cityRepository;
	
	public City createCity(City city) {
		return cityRepository.save(city);
	}
	
	public City getCity(String cityId) {
		return cityRepository.getByCityId(cityId);
	}
	
}
