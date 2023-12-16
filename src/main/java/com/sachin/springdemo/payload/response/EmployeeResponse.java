package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.util.List;

public class EmployeeResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -211210554328452294L;

	private Long empTicketNo;

	private String offSalutation;

	private String empName;

	private Long empDepartmentId;

	private String empDepartmentName;

	private String empDesignation;

	private String empPhoto;

	private String empServiceType;

	private String empEmployeer;

	private String empComments;

	private String isDeleted;

	private List<TrainingEmpResponse> trainingList;

	private Long hotelId;

	private String hotelName;

	public Long getEmpTicketNo() {
		return empTicketNo;
	}

	public void setEmpTicketNo(Long empTicketNo) {
		this.empTicketNo = empTicketNo;
	}

	public String getOffSalutation() {
		return offSalutation;
	}

	public void setOffSalutation(String offSalutation) {
		this.offSalutation = offSalutation;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpDepartmentId() {
		return empDepartmentId;
	}

	public void setEmpDepartmentId(Long empDepartmentId) {
		this.empDepartmentId = empDepartmentId;
	}

	public String getEmpDepartmentName() {
		return empDepartmentName;
	}

	public void setEmpDepartmentName(String empDepartmentName) {
		this.empDepartmentName = empDepartmentName;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public String getEmpPhoto() {
		return empPhoto;
	}

	public void setEmpPhoto(String empPhoto) {
		this.empPhoto = empPhoto;
	}

	public String getEmpServiceType() {
		return empServiceType;
	}

	public void setEmpServiceType(String empServiceType) {
		this.empServiceType = empServiceType;
	}

	public String getEmpEmployeer() {
		return empEmployeer;
	}

	public void setEmpEmployeer(String empEmployeer) {
		this.empEmployeer = empEmployeer;
	}

	public String getEmpComments() {
		return empComments;
	}

	public void setEmpComments(String empComments) {
		this.empComments = empComments;
	}

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public List<TrainingEmpResponse> getTrainingList() {
		return trainingList;
	}

	public void setTrainingList(List<TrainingEmpResponse> trainingList) {
		this.trainingList = trainingList;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeResponse [empTicketNo=").append(empTicketNo).append(", offSalutation=")
				.append(offSalutation).append(", empName=").append(empName).append(", empDepartmentId=")
				.append(empDepartmentId).append(", empDepartmentName=").append(empDepartmentName)
				.append(", empDesignation=").append(empDesignation).append(", empPhoto=").append(empPhoto)
				.append(", empServiceType=").append(empServiceType).append(", empEmployeer=").append(empEmployeer)
				.append(", empComments=").append(empComments).append(", isDeleted=").append(isDeleted)
				.append(", trainingList=").append(trainingList).append(", hotelId=").append(hotelId)
				.append(", hotelName=").append(hotelName).append("]");
		return builder.toString();
	}

}
