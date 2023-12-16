package com.sachin.springdemo.payload.response;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class IncidentResponse implements Serializable {

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

	private String nationalityName;

	private Long injuryId;

	private String injuryName;

	private String additional;

	private Long actionTaken;

	private Long compGiven;

	private BigDecimal compAmount;

	private Date compDate;

	private Long report;

	private String incidentConclusion;

	private Long conclusion;

	private Long itemId;

	private String itemName;

	private String injuryType;

	private Long trainingSubCategoryId;

	private String imageFileData;

	private String imageFileName;

	private String audioFileData;

	private String audioFileName;

	private String videoFileData;

	private String videoFileName;

	private String isDeleted;

	private String categoryName;

	private String subCategoryName;

	private String hotelName;

	private String officerName;

	private String employeeName;

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

	public String getNationalityName() {
		return nationalityName;
	}

	public void setNationalityName(String nationalityName) {
		this.nationalityName = nationalityName;
	}

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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	public String getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getOfficerName() {
		return officerName;
	}

	public void setOfficerName(String officerName) {
		this.officerName = officerName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IncidentResponse [incidentId=").append(incidentId).append(", incidentNo=").append(incidentNo)
				.append(", incidentDt=").append(incidentDt).append(", categoryId=").append(categoryId)
				.append(", subCategoryId=").append(subCategoryId).append(", hotelId=").append(hotelId)
				.append(", officerId=").append(officerId).append(", incidentSub=").append(incidentSub)
				.append(", ticketNo=").append(ticketNo).append(", status=").append(status).append(", empTicketNos=")
				.append(empTicketNos).append(", officerTicketNos=").append(officerTicketNos)
				.append(", incidentActnTkn=").append(incidentActnTkn).append(", incidentCompGvn=")
				.append(incidentCompGvn).append(", incidentRep=").append(incidentRep).append(", nationalityId=")
				.append(nationalityId).append(", nationalityName=").append(nationalityName).append(", injuryId=")
				.append(injuryId).append(", injuryName=").append(injuryName).append(", additional=").append(additional)
				.append(", actionTaken=").append(actionTaken).append(", compGiven=").append(compGiven)
				.append(", compAmount=").append(compAmount).append(", compDate=").append(compDate).append(", report=")
				.append(report).append(", incidentConclusion=").append(incidentConclusion).append(", conclusion=")
				.append(conclusion).append(", itemId=").append(itemId).append(", itemName=").append(itemName)
				.append(", injuryType=").append(injuryType).append(", trainingSubCategoryId=")
				.append(trainingSubCategoryId).append(", imageFileData=").append(imageFileData)
				.append(", imageFileName=").append(imageFileName).append(", audioFileData=").append(audioFileData)
				.append(", audioFileName=").append(audioFileName).append(", videoFileData=").append(videoFileData)
				.append(", videoFileName=").append(videoFileName).append(", isDeleted=").append(isDeleted)
				.append(", categoryName=").append(categoryName).append(", subCategoryName=").append(subCategoryName)
				.append(", hotelName=").append(hotelName).append(", officerName=").append(officerName)
				.append(", employeeName=").append(employeeName).append("]");
		return builder.toString();
	}

}
