package com.sachin.springdemo.payload.response;

import java.io.Serializable;

public class ItemResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5344290121579572363L;

	private Long itemId;

	private String itemName;

	private String itemType;

	private String isDeleted;

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
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
		builder.append("Item [itemId=").append(itemId).append(", itemName=").append(itemName).append(", itemType=")
				.append(itemType).append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
