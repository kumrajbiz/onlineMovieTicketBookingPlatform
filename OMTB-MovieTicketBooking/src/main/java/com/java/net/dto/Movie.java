package com.java.net.dto;

import org.springframework.context.annotation.Configuration;


@Configuration
public class Movie {

    private String movieId;
    private String movieName;
    private String movieCategory;
    private String movieGender;
    private String movieLanguage;
    private String theater;
	public String getMovieId() {
		return movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public String getMovieCategory() {
		return movieCategory;
	}
	public String getMovieGender() {
		return movieGender;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public String getTheater() {
		return theater;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public void setMovieCategory(String movieCategory) {
		this.movieCategory = movieCategory;
	}
	public void setMovieGender(String movieGender) {
		this.movieGender = movieGender;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public void setTheater(String theater) {
		this.theater = theater;
	}
	public Movie(String movieId, String movieName, String movieCategory, String movieGender, String movieLanguage,
			String theater) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieCategory = movieCategory;
		this.movieGender = movieGender;
		this.movieLanguage = movieLanguage;
		this.theater = theater;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieCategory=" + movieCategory
				+ ", movieGender=" + movieGender + ", movieLanguage=" + movieLanguage + ", theater=" + theater + "]";
	}
    
    
    
}

