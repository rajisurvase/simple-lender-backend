package com.sachin.springdemo.payload.request;

import java.io.Serializable;

public class NationalityRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5145902483590299816L;

	private Long nationalityId;

	private String nationalityName;

	private String isDeleted;

	public Long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
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
		builder.append("Nationality [nationalityId=").append(nationalityId).append(", nationalityName=")
				.append(nationalityName).append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
