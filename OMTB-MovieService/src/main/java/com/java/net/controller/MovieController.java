package com.java.net.controller;

import javax.websocket.server.PathParam;

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

import com.java.net.entity.Movie;
import com.java.net.service.MovieService;

@Controller
@RestController
@RequestMapping("/movie")
public class MovieController {
    
	@Autowired
	private MovieService movieService;
	
	@PostMapping("/")
    public Movie createMovie(@RequestBody Movie movieDetails) {
		System.out.println("calling movie object from movie MS");
        String responseMessage = "New Movie has been updated to system";
        HttpStatus status = HttpStatus.ACCEPTED;
        return  movieService.createMovie(movieDetails);
     }
	@GetMapping("/{movieId}")
	public Movie getMovieDetails(@PathVariable("movieId") String movieId) {
		return movieService.getMovie(movieId);
	}
}
