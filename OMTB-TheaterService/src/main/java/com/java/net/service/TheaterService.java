package com.java.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.net.entity.Theater;
import com.java.net.exception.AlreadyExistsException;
import com.java.net.repository.TheaterRepository;

@Service
public class TheaterService {
	
	@Autowired
	private TheaterRepository theaterRepository;
	
    public Theater getTheater(String theaterId) throws AlreadyExistsException{
        return theaterRepository.findByTheaterId(theaterId);
    }

    public Theater createTheater(Theater theater) {
        return theaterRepository.save(theater);
    }

 
}