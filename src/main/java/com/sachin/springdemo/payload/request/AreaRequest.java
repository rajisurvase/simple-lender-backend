package com.sachin.springdemo.payload.request;

import java.io.Serializable;

public class AreaRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5482049934624339467L;

	private Long areaId;

	private String areaName;

	private String isDeleted;

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
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
		builder.append("Area [areaId=").append(areaId).append(", areaName=").append(areaName).append(", isDeleted=")
				.append(isDeleted).append("]");
		return builder.toString();
	}

}
