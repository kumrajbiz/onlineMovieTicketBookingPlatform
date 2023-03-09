package com.java.net.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyObject {
    private Movie movie;
    private Theater theater;
    private City city;
    private Screen screen;
    private Seat seat;
    
	public Movie getMovie() {
		return movie;
	}
	public Theater getTheater() {
		return theater;
	}
	public City getCity() {
		return city;
	}
	public Screen getScreen() {
		return screen;
	}
	public Seat getSeat() {
		return seat;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public MyObject(Movie movie, Theater theater, City city, Screen screen, Seat seat) {
		super();
		this.movie = movie;
		this.theater = theater;
		this.city = city;
		this.screen = screen;
		this.seat = seat;
	}
	public MyObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyObject [movie=" + movie + ", theater=" + theater + ", city=" + city + ", screen=" + screen + ", seat="
				+ seat + "]";
	}

	
   
}