package com.sachin.springdemo.payload.request;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ContractStaffRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 125996817469850925L;

	private Long ticketNo;

	private String esicNo;

	private String csSalutation;

	private String csName;

	private String csCompany;

	private String csDsgn;

	private String csPhoto;

	private String csAdd1;

	private String csAdd2;

	private String csCity;

	private String csPincd;

	private String csTelOff;

	private String csTelRes;

	private String csMob;

	private String csResume;

	private String csComments;

	private String csCountry;

	private Date csDob;

	private String csEmail;

	private String csFax;

	private List<TrainingContractStaffRequest> trainingList;

	private Long hotelId;

	private String aadharCardNumber;

	private String aadharCardFileName;

	public Long getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(Long ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getEsicNo() {
		return esicNo;
	}

	public void setEsicNo(String esicNo) {
		this.esicNo = esicNo;
	}

	public String getCsSalutation() {
		return csSalutation;
	}

	public void setCsSalutation(String csSalutation) {
		this.csSalutation = csSalutation;
	}

	public String getCsName() {
		return csName;
	}

	public void setCsName(String csName) {
		this.csName = csName;
	}

	public String getCsCompany() {
		return csCompany;
	}

	public void setCsCompany(String csCompany) {
		this.csCompany = csCompany;
	}

	public String getCsDsgn() {
		return csDsgn;
	}

	public void setCsDsgn(String csDsgn) {
		this.csDsgn = csDsgn;
	}

	public String getCsPhoto() {
		return csPhoto;
	}

	public void setCsPhoto(String csPhoto) {
		this.csPhoto = csPhoto;
	}

	public String getCsAdd1() {
		return csAdd1;
	}

	public void setCsAdd1(String csAdd1) {
		this.csAdd1 = csAdd1;
	}

	public String getCsAdd2() {
		return csAdd2;
	}

	public void setCsAdd2(String csAdd2) {
		this.csAdd2 = csAdd2;
	}

	public String getCsCity() {
		return csCity;
	}

	public void setCsCity(String csCity) {
		this.csCity = csCity;
	}

	public String getCsPincd() {
		return csPincd;
	}

	public void setCsPincd(String csPincd) {
		this.csPincd = csPincd;
	}

	public String getCsTelOff() {
		return csTelOff;
	}

	public void setCsTelOff(String csTelOff) {
		this.csTelOff = csTelOff;
	}

	public String getCsTelRes() {
		return csTelRes;
	}

	public void setCsTelRes(String csTelRes) {
		this.csTelRes = csTelRes;
	}

	public String getCsMob() {
		return csMob;
	}

	public void setCsMob(String csMob) {
		this.csMob = csMob;
	}

	public String getCsResume() {
		return csResume;
	}

	public void setCsResume(String csResume) {
		this.csResume = csResume;
	}

	public String getCsComments() {
		return csComments;
	}

	public void setCsComments(String csComments) {
		this.csComments = csComments;
	}

	public String getCsCountry() {
		return csCountry;
	}

	public void setCsCountry(String csCountry) {
		this.csCountry = csCountry;
	}

	public Date getCsDob() {
		return csDob;
	}

	public void setCsDob(Date csDob) {
		this.csDob = csDob;
	}

	public String getCsEmail() {
		return csEmail;
	}

	public void setCsEmail(String csEmail) {
		this.csEmail = csEmail;
	}

	public String getCsFax() {
		return csFax;
	}

	public void setCsFax(String csFax) {
		this.csFax = csFax;
	}

	public List<TrainingContractStaffRequest> getTrainingList() {
		return trainingList;
	}

	public void setTrainingList(List<TrainingContractStaffRequest> trainingList) {
		this.trainingList = trainingList;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getAadharCardNumber() {
		return aadharCardNumber;
	}

	public void setAadharCardNumber(String aadharCardNumber) {
		this.aadharCardNumber = aadharCardNumber;
	}

	public String getAadharCardFileName() {
		return aadharCardFileName;
	}

	public void setAadharCardFileName(String aadharCardFileName) {
		this.aadharCardFileName = aadharCardFileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContractStaffRequest [ticketNo=").append(ticketNo).append(", esicNo=").append(esicNo)
				.append(", csSalutation=").append(csSalutation).append(", csName=").append(csName)
				.append(", csCompany=").append(csCompany).append(", csDsgn=").append(csDsgn).append(", csPhoto=")
				.append(csPhoto).append(", csAdd1=").append(csAdd1).append(", csAdd2=").append(csAdd2)
				.append(", csCity=").append(csCity).append(", csPincd=").append(csPincd).append(", csTelOff=")
				.append(csTelOff).append(", csTelRes=").append(csTelRes).append(", csMob=").append(csMob)
				.append(", csResume=").append(csResume).append(", csComments=").append(csComments)
				.append(", csCountry=").append(csCountry).append(", csDob=").append(csDob).append(", csEmail=")
				.append(csEmail).append(", csFax=").append(csFax).append(", trainingList=").append(trainingList)
				.append(", hotelId=").append(hotelId).append(", aadharCardNumber=").append(aadharCardNumber)
				.append(", aadharCardFileName=").append(aadharCardFileName).append("]");
		return builder.toString();
	}

}
