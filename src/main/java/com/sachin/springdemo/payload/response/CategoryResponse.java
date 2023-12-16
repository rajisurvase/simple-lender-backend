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
public class CategoryResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8119127517234133633L;

	private Long categoryId;

	private String categoryName;

	private String categoryCode;

	private String isSubCategory;
	
	private List<SubCategoryResponse> subCategoryResponseList;

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

	public List<SubCategoryResponse> getSubCategoryResponseList() {
		return subCategoryResponseList;
	}

	public void setSubCategoryResponseList(List<SubCategoryResponse> subCategoryResponseList) {
		this.subCategoryResponseList = subCategoryResponseList;
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
		builder.append("CategoryResponse [categoryId=").append(categoryId).append(", categoryName=")
				.append(categoryName).append(", categoryCode=").append(categoryCode).append(", isSubCategory=")
				.append(isSubCategory).append(", subCategoryResponseList=").append(subCategoryResponseList)
				.append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
