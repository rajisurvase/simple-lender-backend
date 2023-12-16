package com.sachin.springdemo.payload.response;

import java.io.Serializable;

public class HotelResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6285915071416776052L;

	private Long hotelId;

	private String hotelName;

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HotelResponse [hotelId=").append(hotelId).append(", hotelName=").append(hotelName).append("]");
		return builder.toString();
	}

}
