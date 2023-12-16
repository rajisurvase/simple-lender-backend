package com.sachin.springdemo.payload.request;

import java.io.Serializable;

public class DepartmentRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3931806204944721698L;

	private Long departmentId;

	private String departmentName;

	private String isDeleted;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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
		builder.append("DepartmentRespone [departmentId=").append(departmentId).append(", departmentName=")
				.append(departmentName).append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
