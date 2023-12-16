package com.sachin.springdemo.payload.request;

import java.io.Serializable;

public class EmployeeSearchRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5602418658166550568L;

	private Long empTicketNo;

	private String empName;

	private Integer pageNo;

	private Integer pageSize;

	public Long getEmpTicketNo() {
		return empTicketNo;
	}

	public void setEmpTicketNo(Long empTicketNo) {
		this.empTicketNo = empTicketNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getPageNo() {
		return pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeSearchRequest [empTicketNo=").append(empTicketNo).append(", empName=").append(empName)
				.append(", pageNo=").append(pageNo).append(", pageSize=").append(pageSize).append("]");
		return builder.toString();
	}

}
