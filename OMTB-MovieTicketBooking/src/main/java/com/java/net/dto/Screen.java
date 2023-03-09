package com.java.net.dto;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Screen {
	
	private String screenId;
	private String screenType;
	private Integer noOfScreen;
	private String theaterId;
	public String getScreenId() {
		return screenId;
	}
	public String getScreenType() {
		return screenType;
	}
	public Integer getNoOfScreen() {
		return noOfScreen;
	}
	public String getTheaterId() {
		return theaterId;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	public void setNoOfScreen(Integer noOfScreen) {
		this.noOfScreen = noOfScreen;
	}
	public void setTheaterId(String theaterId) {
		this.theaterId = theaterId;
	}
	public Screen(String screenId, String screenType, Integer noOfScreen, String theaterId) {
		super();
		this.screenId = screenId;
		this.screenType = screenType;
		this.noOfScreen = noOfScreen;
		this.theaterId = theaterId;
	}
	public Screen() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Screen [screenId=" + screenId + ", screenType=" + screenType + ", noOfScreen=" + noOfScreen
				+ ", theaterId=" + theaterId + "]";
	}
	
	
}

