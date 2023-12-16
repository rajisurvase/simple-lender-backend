/**
 * 
 */
package com.sachin.springdemo.payload.request;

import java.io.Serializable;

/**
 * @author Dheeraj
 *
 */
public class ProgramRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5678092910383940990L;

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
