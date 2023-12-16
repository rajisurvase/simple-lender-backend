package com.sachin.springdemo.payload.request;

import java.io.Serializable;
import java.util.List;

public class EmployeeRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -211210554328452294L;

	private Long empTicketNo;

	private String offSalutation;

	private String empName;

	private Long empDepartmentId;

	private String empDesignation;

	private String empPhoto;

	private String empServiceType;

	private String empEmployeer;

	private String empComments;

	private String isDeleted;

	private List<TrainingEmpRequest> trainingList;

	private Long hotelId;

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

	public List<TrainingEmpRequest> getTrainingList() {
		return trainingList;
	}

	public void setTrainingList(List<TrainingEmpRequest> trainingList) {
		this.trainingList = trainingList;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeRequest [empTicketNo=").append(empTicketNo).append(", offSalutation=")
				.append(offSalutation).append(", empName=").append(empName).append(", empDepartmentId=")
				.append(empDepartmentId).append(", empDesignation=").append(empDesignation).append(", empPhoto=")
				.append(empPhoto).append(", empServiceType=").append(empServiceType).append(", empEmployeer=")
				.append(empEmployeer).append(", empComments=").append(empComments).append(", isDeleted=")
				.append(isDeleted).append(", trainingList=").append(trainingList).append(", hotelId=").append(hotelId)
				.append("]");
		return builder.toString();
	}

}
