package com.sachin.springdemo.payload.response;

import java.io.Serializable;

/**
 * @author Dheeraj
 *
 */
public class ProgramResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -405193804877622567L;

	private Long programId;

	private String programName;

	private String isDeleted;

	public Long getProgramId() {
		return programId;
	}

	public void setProgramId(Long programId) {
		this.programId = programId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
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
		builder.append("Program [programId=").append(programId).append(", programName=").append(programName)
				.append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
