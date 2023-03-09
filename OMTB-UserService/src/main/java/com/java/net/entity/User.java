package com.java.net.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GenericGenerator(name="seqid", strategy="com.java.net.entity.UserIdGenerator")
	@GeneratedValue(generator="seqid")
	@Column(unique = true, nullable = false, length = 20)
	private String userId;
	private String userMobile;
	private String userEmail;
	private Integer bookedSoFar;
	
	
	public String getUserId() {
		return userId;
	}
	public String getUserMobile() {
		return userMobile;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public Integer getBookedSoFar() {
		return bookedSoFar;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public void setBookedSoFar(Integer bookedSoFar) {
		this.bookedSoFar = bookedSoFar;
	}
	public User(String userId, String userMobile, String userEmail, Integer bookedSoFar) {
		super();
		this.userId = userId;
		this.userMobile = userMobile;
		this.userEmail = userEmail;
		this.bookedSoFar = bookedSoFar;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userMobile=" + userMobile + ", userEmail=" + userEmail + ", bookedSoFar="
				+ bookedSoFar + "]";
	}
	
	
	
	
	
}
