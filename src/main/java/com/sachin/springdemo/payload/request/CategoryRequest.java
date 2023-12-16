/**
 * 
 */
package com.sachin.springdemo.payload.request;

import java.io.Serializable;
import java.util.List;

/**
 * @author Dheeraj
 *
 */
public class CategoryRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8119127517234133633L;

	private Long categoryId;

	private String categoryName;

	private String categoryCode;

	private String isSubCategory;

	private String isDeleted;
	
	private List<SubCategoryRequest> subCategoryList;

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

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public List<SubCategoryRequest> getSubCategoryList() {
		return subCategoryList;
	}

	public void setSubCategoryList(List<SubCategoryRequest> subCategoryList) {
		this.subCategoryList = subCategoryList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CategoryRequest [categoryId=").append(categoryId).append(", categoryName=").append(categoryName)
				.append(", categoryCode=").append(categoryCode).append(", isSubCategory=").append(isSubCategory)
				.append(", isDeleted=").append(isDeleted).append(", subCategoryList=").append(subCategoryList)
				.append("]");
		return builder.toString();
	}

}
