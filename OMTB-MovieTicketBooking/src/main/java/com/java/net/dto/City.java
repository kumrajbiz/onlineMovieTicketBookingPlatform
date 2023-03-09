package com.java.net.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class City {
  
	
	private String cityId;
	private String cityName;
	private String zipcode;
	public String getCityId() {
		return cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public City(String cityId, String cityName, String zipcode) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.zipcode = zipcode;
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [cityId=" + cityId + ", cityName=" + cityName + ", zipcode=" + zipcode + "]";
	}
	
	
  
}

