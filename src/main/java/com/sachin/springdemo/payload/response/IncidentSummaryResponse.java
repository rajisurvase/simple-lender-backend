/**
 * 
 */
package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Dheeraj
 *
 */
public class IncidentSummaryResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1144088051099145597L;

	private Long incidentId;

	private String status;

	private Date incidentDt;

	private String categoryName;

	private String subCategoryName;

	private String officerName;

	private String employeeName;
	
	private String subject;
	
	private String incidentNo;
	
	

	public Long getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(Long incidentId) {
		this.incidentId = incidentId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getIncidentDt() {
		return incidentDt;
	}

	public void setIncidentDt(Date incidentDt) {
		this.incidentDt = incidentDt;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getIncidentNo() {
		return incidentNo;
	}

	public void setIncidentNo(String incidentNo) {
		this.incidentNo = incidentNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IncidentSummaryResponse [incidentId=").append(incidentId).append(", status=").append(status)
				.append(", incidentDt=").append(incidentDt).append(", categoryName=").append(categoryName)
				.append(", subCategoryName=").append(subCategoryName).append(", officerName=").append(officerName)
				.append(", employeeName=").append(employeeName).append(", subject=").append(subject)
				.append(", incidentNo=").append(incidentNo).append("]");
		return builder.toString();
	}

}
