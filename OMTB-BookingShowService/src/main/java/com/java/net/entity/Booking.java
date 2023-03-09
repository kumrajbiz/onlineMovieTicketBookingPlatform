package com.java.net.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GenericGenerator(name="seqid", strategy="com.java.net.entity.BookingIdGenerator")
	@GeneratedValue(generator="seqid")
	@Column(unique = true, nullable = false, length = 20)
	private String bookingId;
	private String userMap;
	private String theaterMap;
	private String screenMap;
	private String seatMap;
	private String paymentMap="PAY22030307S0001";
	private String paymentSatus="SUCCESS";
	
	
	
	
	public String getBookingId() {
		return bookingId;
	}
	public String getUserMap() {
		return userMap;
	}
	public String getTheaterMap() {
		return theaterMap;
	}
	public String getScreenMap() {
		return screenMap;
	}
	public String getSeatMap() {
		return seatMap;
	}
	public String getPaymentMap() {
		return paymentMap;
	}
	public String getPaymentSatus() {
		return paymentSatus;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public void setUserMap(String userMap) {
		this.userMap = userMap;
	}
	public void setTheaterMap(String theaterMap) {
		this.theaterMap = theaterMap;
	}
	public void setScreenMap(String screenMap) {
		this.screenMap = screenMap;
	}
	public void setSeatMap(String seatMap) {
		this.seatMap = seatMap;
	}
	public void setPaymentMap(String paymentMap) {
		this.paymentMap = paymentMap;
	}
	public void setPaymentSatus(String paymentSatus) {
		this.paymentSatus = paymentSatus;
	}
	public Booking(String bookingId, String userMap, String theaterMap, String screenMap, String seatMap,
			String paymentMap, String paymentSatus) {
		super();
		this.bookingId = bookingId;
		this.userMap = userMap;
		this.theaterMap = theaterMap;
		this.screenMap = screenMap;
		this.seatMap = seatMap;
		this.paymentMap = paymentMap;
		this.paymentSatus = paymentSatus;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userMap=" + userMap + ", theaterMap=" + theaterMap
				+ ", screenMap=" + screenMap + ", seatMap=" + seatMap + ", paymentMap=" + paymentMap + ", paymentSatus="
				+ paymentSatus + "]";
	}
	
	
	
	
	
}
