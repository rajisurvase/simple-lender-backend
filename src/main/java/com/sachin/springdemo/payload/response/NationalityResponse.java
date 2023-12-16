package com.sachin.springdemo.payload.response;

import java.io.Serializable;

public class NationalityResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -613087034468138681L;

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
