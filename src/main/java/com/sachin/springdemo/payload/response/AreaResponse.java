package com.sachin.springdemo.payload.response;

import java.io.Serializable;

public class AreaResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -137339247448004164L;

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
