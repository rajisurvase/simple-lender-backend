package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.util.Date;

public class TrainingContractStaffResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8830925658078100845L;

	private Long trainingId;

	private Date trainingDt;

	private String program;

	private String trainingDuration;

	private String trainingDtls;

	private String esicNo;

	public Long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Long trainingId) {
		this.trainingId = trainingId;
	}

	public Date getTrainingDt() {
		return trainingDt;
	}

	public void setTrainingDt(Date trainingDt) {
		this.trainingDt = trainingDt;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public String getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}

	public String getTrainingDtls() {
		return trainingDtls;
	}

	public void setTrainingDtls(String trainingDtls) {
		this.trainingDtls = trainingDtls;
	}

	public String getEsicNo() {
		return esicNo;
	}

	public void setEsicNo(String esicNo) {
		this.esicNo = esicNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrainingContractStaff [trainingId=").append(trainingId).append(", trainingDt=")
				.append(trainingDt).append(", program=").append(program).append(", trainingDuration=")
				.append(trainingDuration).append(", trainingDtls=").append(trainingDtls).append(", esicNo=")
				.append(esicNo).append("]");
		return builder.toString();
	}

}
