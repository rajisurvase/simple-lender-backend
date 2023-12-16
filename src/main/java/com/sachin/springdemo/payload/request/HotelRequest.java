package com.sachin.springdemo.payload.request;

import java.io.Serializable;

public class HotelRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2163423251637338451L;

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
		builder.append("HotelRequest [hotelId=").append(hotelId).append(", hotelName=").append(hotelName).append("]");
		return builder.toString();
	}

}
