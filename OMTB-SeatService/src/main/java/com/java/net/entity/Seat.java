package com.java.net.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="seat")
public class Seat {
	
	@Id
	@GenericGenerator(name="seqid", strategy="com.java.net.entity.SeatIdGenerator")
	@GeneratedValue(generator="seqid")
	@Column(unique = true, nullable = false, length = 20)
	private String seatId;
	private String seatType;
	private Integer noOfSeat;
	private String screenId;
	private Integer totalSeat;
	private String seatCategory;
	
	public String getSeatId() {
		return seatId;
	}
	public String getSeatType() {
		return seatType;
	}
	public Integer getNoOfSeat() {
		return noOfSeat;
	}
	public String getScreenId() {
		return screenId;
	}
	public Integer getTotalSeat() {
		return totalSeat;
	}
	public String getSeatCategory() {
		return seatCategory;
	}
	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public void setNoOfSeat(Integer noOfSeat) {
		this.noOfSeat = noOfSeat;
	}
	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}
	public void setTotalSeat(Integer totalSeat) {
		this.totalSeat = totalSeat;
	}
	public void setSeatCategory(String seatCategory) {
		this.seatCategory = seatCategory;
	}
	public Seat(String seatId, String seatType, Integer noOfSeat, String screenId, Integer totalSeat,
			String seatCategory) {
		super();
		this.seatId = seatId;
		this.seatType = seatType;
		this.noOfSeat = noOfSeat;
		this.screenId = screenId;
		this.totalSeat = totalSeat;
		this.seatCategory = seatCategory;
	}
	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatType=" + seatType + ", noOfSeat=" + noOfSeat + ", screenId=" + screenId
				+ ", totalSeat=" + totalSeat + ", seatCategory=" + seatCategory + "]";
	}

	
	
	
	
}
