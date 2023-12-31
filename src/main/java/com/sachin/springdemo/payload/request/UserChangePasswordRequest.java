package com.sachin.springdemo.payload.request;

import javax.validation.constraints.NotBlank;

public class UserChangePasswordRequest {

	@NotBlank
	private String username;

	@NotBlank
	private String currentPassword;

	@NotBlank
	private String newPassword;

	@NotBlank
	private String confirmNewPassword;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}

}
