/**
 * 
 */
package com.sachin.springdemo.payload.response;

import java.io.Serializable;

/**
 * @author Dheeraj
 *
 */
public class IncidentChartResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5569572355846029669L;

	private ReportLabelAndData categoryChartData;
	
	private ReportLabelAndData subCategoryChartData;

	private ReportLabelAndData statusChartData;

	private ReportLabelAndData incidentChartData;
	
	private ReportLabelAndData injuryChartData;
	
	private ReportLabelAndData itemChartData;
	
	private ReportLabelAndData nationalityChartData;

	public ReportLabelAndData getCategoryChartData() {
		return categoryChartData;
	}

	public void setCategoryChartData(ReportLabelAndData categoryChartData) {
		this.categoryChartData = categoryChartData;
	}

	public ReportLabelAndData getSubCategoryChartData() {
		return subCategoryChartData;
	}

	public void setSubCategoryChartData(ReportLabelAndData subCategoryChartData) {
		this.subCategoryChartData = subCategoryChartData;
	}

	public ReportLabelAndData getStatusChartData() {
		return statusChartData;
	}

	public void setStatusChartData(ReportLabelAndData statusChartData) {
		this.statusChartData = statusChartData;
	}

	public ReportLabelAndData getIncidentChartData() {
		return incidentChartData;
	}

	public void setIncidentChartData(ReportLabelAndData incidentChartData) {
		this.incidentChartData = incidentChartData;
	}

	public ReportLabelAndData getInjuryChartData() {
		return injuryChartData;
	}

	public void setInjuryChartData(ReportLabelAndData injuryChartData) {
		this.injuryChartData = injuryChartData;
	}

	public ReportLabelAndData getItemChartData() {
		return itemChartData;
	}

	public void setItemChartData(ReportLabelAndData itemChartData) {
		this.itemChartData = itemChartData;
	}

	public ReportLabelAndData getNationalityChartData() {
		return nationalityChartData;
	}

	public void setNationalityChartData(ReportLabelAndData nationalityChartData) {
		this.nationalityChartData = nationalityChartData;
	}

}
