/**
 * 
 */
package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.util.List;

/**
 * @author Dheeraj
 *
 */
public class ReportLabelAndData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -744115144825003164L;

	private List<String> labels;
	private List<String> data;
	
	public List<String> getLabels() {
		return labels;
	}
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public List<String> getData() {
		return data;
	}
	public void setData(List<String> data) {
		this.data = data;
	}
	
	
}
