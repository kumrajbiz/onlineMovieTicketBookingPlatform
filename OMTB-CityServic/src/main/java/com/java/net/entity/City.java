package com.java.net.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="city")
public class City {
	
	@Id
	@GenericGenerator(name="seqid", strategy="com.java.net.entity.CityIdGenerator")
	@GeneratedValue(generator="seqid")
	@Column(unique = true, nullable = false, length = 20)
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