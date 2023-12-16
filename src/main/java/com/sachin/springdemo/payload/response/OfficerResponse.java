package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.util.Date;

public class OfficerResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7938685440580033626L;

	private Long officerId;

	private Long hotelId;

	private String hotelName;

	private String offSalutation;

	private String offName;

	private String offGrade;

	private Date dtOfJoining;

	private String offDesignation;

	private String offPhoto;

	private String offResume;

	private String offComments;

	private String offAddress1;

	private String offAddress2;

	private String offCity;

	private String offPinCode;

	private String offCountry;

	private String offResTel;

	private String offMobile;

	private String offEmail;

	private String offEmpNumber;

	private String isDeleted;

	public Long getOfficerId() {
		return officerId;
	}

	public void setOfficerId(Long officerId) {
		this.officerId = officerId;
	}

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

	public String getOffSalutation() {
		return offSalutation;
	}

	public void setOffSalutation(String offSalutation) {
		this.offSalutation = offSalutation;
	}

	public String getOffName() {
		return offName;
	}

	public void setOffName(String offName) {
		this.offName = offName;
	}

	public String getOffGrade() {
		return offGrade;
	}

	public void setOffGrade(String offGrade) {
		this.offGrade = offGrade;
	}

	public Date getDtOfJoining() {
		return dtOfJoining;
	}

	public void setDtOfJoining(Date dtOfJoining) {
		this.dtOfJoining = dtOfJoining;
	}

	public String getOffDesignation() {
		return offDesignation;
	}

	public void setOffDesignation(String offDesignation) {
		this.offDesignation = offDesignation;
	}

	public String getOffPhoto() {
		return offPhoto;
	}

	public void setOffPhoto(String offPhoto) {
		this.offPhoto = offPhoto;
	}

	public String getOffResume() {
		return offResume;
	}

	public void setOffResume(String offResume) {
		this.offResume = offResume;
	}

	public String getOffComments() {
		return offComments;
	}

	public void setOffComments(String offComments) {
		this.offComments = offComments;
	}

	public String getOffAddress1() {
		return offAddress1;
	}

	public void setOffAddress1(String offAddress1) {
		this.offAddress1 = offAddress1;
	}

	public String getOffAddress2() {
		return offAddress2;
	}

	public void setOffAddress2(String offAddress2) {
		this.offAddress2 = offAddress2;
	}

	public String getOffCity() {
		return offCity;
	}

	public void setOffCity(String offCity) {
		this.offCity = offCity;
	}

	public String getOffPinCode() {
		return offPinCode;
	}

	public void setOffPinCode(String offPinCode) {
		this.offPinCode = offPinCode;
	}

	public String getOffCountry() {
		return offCountry;
	}

	public void setOffCountry(String offCountry) {
		this.offCountry = offCountry;
	}

	public String getOffResTel() {
		return offResTel;
	}

	public void setOffResTel(String offResTel) {
		this.offResTel = offResTel;
	}

	public String getOffMobile() {
		return offMobile;
	}

	public void setOffMobile(String offMobile) {
		this.offMobile = offMobile;
	}

	public String getOffEmail() {
		return offEmail;
	}

	public void setOffEmail(String offEmail) {
		this.offEmail = offEmail;
	}

	public String getOffEmpNumber() {
		return offEmpNumber;
	}

	public void setOffEmpNumber(String offEmpNumber) {
		this.offEmpNumber = offEmpNumber;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OfficerResponse [officerId=").append(officerId).append(", hotelId=").append(hotelId)
				.append(", hotelName=").append(hotelName).append(", offSalutation=").append(offSalutation)
				.append(", offName=").append(offName).append(", offGrade=").append(offGrade).append(", dtOfJoining=")
				.append(dtOfJoining).append(", offDesignation=").append(offDesignation).append(", offPhoto=")
				.append(offPhoto).append(", offResume=").append(offResume).append(", offComments=").append(offComments)
				.append(", offAddress1=").append(offAddress1).append(", offAddress2=").append(offAddress2)
				.append(", offCity=").append(offCity).append(", offPinCode=").append(offPinCode).append(", offCountry=")
				.append(offCountry).append(", offResTel=").append(offResTel).append(", offMobile=").append(offMobile)
				.append(", offEmail=").append(offEmail).append(", offEmpNumber=").append(offEmpNumber)
				.append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
