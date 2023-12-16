/**
 * 
 */
package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author Dheeraj
 *
 */
public class CategoryCustomResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8119127517234133633L;

	private Long categoryId;

	private String categoryName;

	private String categoryCode;

	private String isSubCategory;

	private HashMap<String, Object> labels;

	private String isDeleted;

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getIsSubCategory() {
		return isSubCategory;
	}

	public void setIsSubCategory(String isSubCategory) {
		this.isSubCategory = isSubCategory;
	}

	public HashMap<String, Object> getLabels() {
		return labels;
	}

	public void setLabels(HashMap<String, Object> labels) {
		this.labels = labels;
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
		builder.append("CategoryCustomResponse [categoryId=").append(categoryId).append(", categoryName=")
				.append(categoryName).append(", categoryCode=").append(categoryCode).append(", isSubCategory=")
				.append(isSubCategory).append(", labels=").append(labels).append(", isDeleted=").append(isDeleted)
				.append("]");
		return builder.toString();
	}

}
