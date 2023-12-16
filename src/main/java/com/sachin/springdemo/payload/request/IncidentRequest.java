package com.sachin.springdemo.payload.request;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class IncidentRequest implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = -8181130180955801855L;

	private Long incidentId;

	private String incidentNo;

	private Date incidentDt;

	private Long categoryId;

	private Long subCategoryId;
	
	private Long hotelId;

	private String officerId;

	private String incidentSub;

	private Long ticketNo;

	private String status;

	private String empTicketNos;
	
	private String officerTicketNos;

	private String incidentActnTkn;

	private String incidentCompGvn;

	private String incidentRep;

	private Long nationalityId;

	private Long injuryId;

	private String additional;

	private Long actionTaken;

	private Long compGiven;

	private BigDecimal compAmount;

	private Date compDate;

	private Long report;

	private String incidentConclusion;

	private Long conclusion;

	private Long itemId;

	private String injuryType;

	private Long trainingSubCategoryId;

	private String imageFileData;

	private String imageFileName;

	private String audioFileData;

	private String audioFileName;

	private String videoFileData;

	private String videoFileName;

	public Long getIncidentId() {
		return incidentId;
	}

	public void setIncidentId(Long incidentId) {
		this.incidentId = incidentId;
	}

	public String getIncidentNo() {
		return incidentNo;
	}

	public void setIncidentNo(String incidentNo) {
		this.incidentNo = incidentNo;
	}

	public Date getIncidentDt() {
		return incidentDt;
	}

	public void setIncidentDt(Date incidentDt) {
		this.incidentDt = incidentDt;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getSubCategoryId() {
		return subCategoryId;
	}

	public void setSubCategoryId(Long subCategoryId) {
		this.subCategoryId = subCategoryId;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getOfficerId() {
		return officerId;
	}

	public void setOfficerId(String officerId) {
		this.officerId = officerId;
	}

	public String getIncidentSub() {
		return incidentSub;
	}

	public void setIncidentSub(String incidentSub) {
		this.incidentSub = incidentSub;
	}

	public Long getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(Long ticketNo) {
		this.ticketNo = ticketNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmpTicketNos() {
		return empTicketNos;
	}

	public void setEmpTicketNos(String empTicketNos) {
		this.empTicketNos = empTicketNos;
	}

	public String getOfficerTicketNos() {
		return officerTicketNos;
	}

	public void setOfficerTicketNos(String officerTicketNos) {
		this.officerTicketNos = officerTicketNos;
	}

	public String getIncidentActnTkn() {
		return incidentActnTkn;
	}

	public void setIncidentActnTkn(String incidentActnTkn) {
		this.incidentActnTkn = incidentActnTkn;
	}

	public String getIncidentCompGvn() {
		return incidentCompGvn;
	}

	public void setIncidentCompGvn(String incidentCompGvn) {
		this.incidentCompGvn = incidentCompGvn;
	}

	public String getIncidentRep() {
		return incidentRep;
	}

	public void setIncidentRep(String incidentRep) {
		this.incidentRep = incidentRep;
	}

	public Long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(Long nationalityId) {
		this.nationalityId = nationalityId;
	}

	public Long getInjuryId() {
		return injuryId;
	}

	public void setInjuryId(Long injuryId) {
		this.injuryId = injuryId;
	}

	public String getAdditional() {
		return additional;
	}

	public void setAdditional(String additional) {
		this.additional = additional;
	}

	public Long getActionTaken() {
		return actionTaken;
	}

	public void setActionTaken(Long actionTaken) {
		this.actionTaken = actionTaken;
	}

	public Long getCompGiven() {
		return compGiven;
	}

	public void setCompGiven(Long compGiven) {
		this.compGiven = compGiven;
	}

	public BigDecimal getCompAmount() {
		return compAmount;
	}

	public void setCompAmount(BigDecimal compAmount) {
		this.compAmount = compAmount;
	}

	public Date getCompDate() {
		return compDate;
	}

	public void setCompDate(Date compDate) {
		this.compDate = compDate;
	}

	public Long getReport() {
		return report;
	}

	public void setReport(Long report) {
		this.report = report;
	}

	public String getIncidentConclusion() {
		return incidentConclusion;
	}

	public void setIncidentConclusion(String incidentConclusion) {
		this.incidentConclusion = incidentConclusion;
	}

	public Long getConclusion() {
		return conclusion;
	}

	public void setConclusion(Long conclusion) {
		this.conclusion = conclusion;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getInjuryType() {
		return injuryType;
	}

	public void setInjuryType(String injuryType) {
		this.injuryType = injuryType;
	}

	public Long getTrainingSubCategoryId() {
		return trainingSubCategoryId;
	}

	public void setTrainingSubCategoryId(Long trainingSubCategoryId) {
		this.trainingSubCategoryId = trainingSubCategoryId;
	}

	public String getImageFileData() {
		return imageFileData;
	}

	public void setImageFileData(String imageFileData) {
		this.imageFileData = imageFileData;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getAudioFileData() {
		return audioFileData;
	}

	public void setAudioFileData(String audioFileData) {
		this.audioFileData = audioFileData;
	}

	public String getAudioFileName() {
		return audioFileName;
	}

	public void setAudioFileName(String audioFileName) {
		this.audioFileName = audioFileName;
	}

	public String getVideoFileData() {
		return videoFileData;
	}

	public void setVideoFileData(String videoFileData) {
		this.videoFileData = videoFileData;
	}

	public String getVideoFileName() {
		return videoFileName;
	}

	public void setVideoFileName(String videoFileName) {
		this.videoFileName = videoFileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IncidentRequest [incidentId=").append(incidentId).append(", incidentNo=").append(incidentNo)
				.append(", incidentDt=").append(incidentDt).append(", categoryId=").append(categoryId)
				.append(", subCategoryId=").append(subCategoryId).append(", hotelId=").append(hotelId)
				.append(", officerId=").append(officerId).append(", incidentSub=").append(incidentSub)
				.append(", ticketNo=").append(ticketNo).append(", status=").append(status).append(", empTicketNos=")
				.append(empTicketNos).append(", officerTicketNos=").append(officerTicketNos)
				.append(", incidentActnTkn=").append(incidentActnTkn).append(", incidentCompGvn=")
				.append(incidentCompGvn).append(", incidentRep=").append(incidentRep).append(", nationalityId=")
				.append(nationalityId).append(", injuryId=").append(injuryId).append(", additional=").append(additional)
				.append(", actionTaken=").append(actionTaken).append(", compGiven=").append(compGiven)
				.append(", compAmount=").append(compAmount).append(", compDate=").append(compDate).append(", report=")
				.append(report).append(", incidentConclusion=").append(incidentConclusion).append(", conclusion=")
				.append(conclusion).append(", itemId=").append(itemId).append(", injuryType=").append(injuryType)
				.append(", trainingSubCategoryId=").append(trainingSubCategoryId).append(", imageFileData=")
				.append(imageFileData).append(", imageFileName=").append(imageFileName).append(", audioFileData=")
				.append(audioFileData).append(", audioFileName=").append(audioFileName).append(", videoFileData=")
				.append(videoFileData).append(", videoFileName=").append(videoFileName).append("]");
		return builder.toString();
	}

}
