package com.sachin.springdemo.payload.request;

import java.io.Serializable;

public class ServiceRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2708179016880097131L;

	private Long serviceId;

	private String serviceName;

	private String isDeleted;

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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
		builder.append("Service [serviceId=").append(serviceId).append(", serviceName=").append(serviceName)
				.append(", isDeleted=").append(isDeleted).append("]");
		return builder.toString();
	}

}
