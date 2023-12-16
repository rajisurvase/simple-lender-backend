package com.sachin.springdemo.payload.request;

import java.io.Serializable;
import java.util.Date;

public class IncidentReportRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8990893736657298730L;

	private Date fromDate;

	private Date toDate;

	private String reportType;
	
	private Long categoryId;

	private Long subCategoryId;
	
	private Long nationalityId;

	private Long injuryId;
	
	private String incidentNo;

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public String getIncidentNo() {
		return incidentNo;
	}

	public void setIncidentNo(String incidentNo) {
		this.incidentNo = incidentNo;
	}

	public Long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public Long getInjuryId() {
		return injuryId;
	}

	public void setInjuryId(Long injuryId) {
		this.injuryId = injuryId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IncidentReportRequest [fromDate=").append(fromDate).append(", toDate=").append(toDate)
				.append(", reportType=").append(reportType).append(", categoryId=").append(categoryId)
				.append(", subCategoryId=").append(subCategoryId).append(", nationalityId=").append(nationalityId)
				.append(", injuryId=").append(injuryId).append(", incidentNo=").append(incidentNo).append("]");
		return builder.toString();
	}

}
