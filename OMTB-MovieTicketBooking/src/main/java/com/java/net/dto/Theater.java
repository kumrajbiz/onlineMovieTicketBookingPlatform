package com.java.net.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Theater {
    private String theaterId;
    private String theaterName;
    private String theaterLocation;
    private String theaterCity;
    private String theaterType;
    private String cityId;
	public String getTheaterId() {
		return theaterId;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public String getTheaterLocation() {
		return theaterLocation;
	}
	public String getTheaterCity() {
		return theaterCity;
	}
	public String getTheaterType() {
		return theaterType;
	}
	public String getCityId() {
		return cityId;
	}
	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public void setTheaterLocation(String theaterLocation) {
		this.theaterLocation = theaterLocation;
	}
	public void setTheaterCity(String theaterCity) {
		this.theaterCity = theaterCity;
	}
	public void setTheaterType(String theaterType) {
		this.theaterType = theaterType;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public Theater(String theaterId, String theaterName, String theaterLocation, String theaterCity, String theaterType,
			String cityId) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.theaterLocation = theaterLocation;
		this.theaterCity = theaterCity;
		this.theaterType = theaterType;
		this.cityId = cityId;
	}
	public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterLocation="
				+ theaterLocation + ", theaterCity=" + theaterCity + ", theaterType=" + theaterType + ", cityId="
				+ cityId + "]";
	}
    
    
    
	
    
}

