package com.java.net.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.net.entity.Screen;
import com.java.net.repository.ScreenRepository;

@Service
public class ScreenService {

	@Autowired
	private ScreenRepository screenRepository;
	
	public Screen createScreen(Screen screen) {
		return screenRepository.save(screen);
	}
	
	
	public Screen getScreen(String sid) {
		return screenRepository.findByScreenId(sid);
	}
	
	
}
