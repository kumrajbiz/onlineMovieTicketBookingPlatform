package com.java.net.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Movie")
public class Movie {

	@Id
	@GenericGenerator(name="seqid", strategy="com.java.net.entity.UserIdGenerator")
	@GeneratedValue(generator="seqid")
	@Column(unique = true, nullable = false, length = 20)
    private String movieId;
    private String movieName;
    private String movieCategory;
    private String movieGender;
    private String movieLanguage;
    private String theater;
    
    //Setter and Getter

	public String getMovieName() {
		return movieName;
	}
	public String getMovieId() {
		return movieId;
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
	public Movie(String id, String movieName, String movieCategory, String movieGender, String movieLanguage,
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
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieCategory=" + movieCategory + ", movieGender="
				+ movieGender + ", movieLanguage=" + movieLanguage + ", theater=" + theater + "]";
	}
    
    

}
