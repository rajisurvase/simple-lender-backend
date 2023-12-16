package com.sachin.springdemo.payload.request;

import java.io.Serializable;

public class InjuryRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5884315971480238574L;

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
