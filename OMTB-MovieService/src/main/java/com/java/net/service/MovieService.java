package com.java.net.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.net.entity.Movie;
import com.java.net.exception.MovieNotFoundException;
import com.java.net.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

    private final Map<String, Movie> movies;

    public MovieService() {
        this.movies = new HashMap<>();
    }

    public Movie getMovie(String movieId) {
        if (movieId.isEmpty()) {
            throw new MovieNotFoundException();
        }
        return movieRepository.findByMovieId(movieId);
    }

    public Movie createMovie(Movie movie) {
    	return movieRepository.save(movie);
    }

}
