package com.java.net.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.net.dto.City;
import com.java.net.dto.Movie;
import com.java.net.dto.MyObject;
import com.java.net.dto.Screen;
import com.java.net.dto.Seat;
import com.java.net.dto.Theater;

@Service
public class MyService {

	
	@Autowired
	private RestTemplate restTemplate;
	
	
	
	public void createDetails(MyObject incomingRequest) {
		MyObject myObject = new MyObject();
		Movie movieDto = new Movie();
		Theater theaterDto = new Theater();
		Screen screenDto = new Screen();
		Seat seatDto = new Seat();
		
	
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Movie> movieRequestEntity = new HttpEntity<>(incomingRequest.getMovie(), headers);
		HttpEntity<City> cityRequestEntity = new HttpEntity<>(incomingRequest.getCity(), headers);
		HttpEntity<Screen> screenRequestEntity = new HttpEntity<>(incomingRequest.getScreen(), headers);
		HttpEntity<Seat> seatRequestEntity = new HttpEntity<>(incomingRequest.getSeat(), headers);
		HttpEntity<Theater> theaterRequestEntity = new HttpEntity<>(incomingRequest.getTheater(), headers);
		//Calling in the sequence of genreting key
		
		City city = restTemplate.postForObject("http://localhost:9006/city/", cityRequestEntity, City.class);
		System.out.println("After calling city MyOBJ from mycontroller ");
		
		Theater theater = restTemplate.postForObject("http://localhost:9004/theater/", theaterDto, Theater.class);
		System.out.println("After calling theater MyOBJ from mycontroller ");
		movieDto.setTheater(theater.getTheaterId());
		screenDto.setTheaterId(theater.getTheaterId());
		
		Screen screen = restTemplate.postForObject("http://localhost:9002/screen/", screenRequestEntity, Screen.class);
		System.out.println("After calling screen MyOBJ from mycontroller ");		
		seatDto.setScreenId(screen.getScreenId());
		
		Movie movie = restTemplate.postForObject("http://localhost:9001/movie/", movieRequestEntity, Movie.class);
		System.out.println("After calling movie MyOBJ from mycontroller ");

		Seat seat = restTemplate.postForObject("http://localhost:9003/seat/", seatRequestEntity, Seat.class);
		System.out.println("After calling seat MyOBJ from mycontroller ");

	
		myObject.setMovie(movie);
		myObject.setCity(city);
		myObject.setScreen(screen);
		myObject.setSeat(seat);
		myObject.setTheater(theater);

		System.out.println(myObject.toString());
		
	}
	

	

}
