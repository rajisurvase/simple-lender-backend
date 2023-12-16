package com.sachin.springdemo.payload.response;

import java.io.Serializable;

public class EmployerResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5209822109563322551L;

	private Long employerId;

	private String employerName;

	private String isDeleted;

	public Long getEmployerId() {
		return employerId;
	}

	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
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
		builder.append("Employer [employerId=").append(employerId).append(", employerName=").append(employerName)
				.append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
