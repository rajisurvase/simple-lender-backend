package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.util.Date;

public class TrainingEmpResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7410248460563791904L;

	private Long trainingId;

	private Date trainingDt;

	private String program;

	private String trainingDuration;

	private String trainingDtls;

	private String trainingType;

	private Long ticketNo;

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

	public String getTrainingType() {
		return trainingType;
	}

	public void setTrainingType(String trainingType) {
		this.trainingType = trainingType;
	}

	public Long getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(Long ticketNo) {
		this.ticketNo = ticketNo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TrainingEmp [trainingId=").append(trainingId).append(", trainingDt=").append(trainingDt)
				.append(", program=").append(program).append(", trainingDuration=").append(trainingDuration)
				.append(", trainingDtls=").append(trainingDtls).append(", trainingType=").append(trainingType)
				.append(", ticketNo=").append(ticketNo).append("]");
		return builder.toString();
	}

}
