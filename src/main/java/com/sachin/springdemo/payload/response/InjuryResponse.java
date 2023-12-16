package com.sachin.springdemo.payload.response;

import java.io.Serializable;

public class InjuryResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3055467775263789922L;

	private Long injuryId;

	private String injuryName;

	public Long getInjuryId() {
		return injuryId;
	}

	public void setInjuryId(Long injuryId) {
		this.injuryId = injuryId;
	}

	public String getInjuryName() {
		return injuryName;
	}

	public void setInjuryName(String injuryName) {
		this.injuryName = injuryName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InjuryResponse [injuryId=").append(injuryId).append(", injuryName=").append(injuryName)
				.append("]");
		return builder.toString();
	}

}
