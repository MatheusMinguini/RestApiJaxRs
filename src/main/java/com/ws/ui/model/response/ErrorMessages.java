package com.ws.ui.model.response;

public enum ErrorMessages {

	
	MISSING_REQUIRED_FIELD("Missing required field. please check the documentation."),
	RECORD_ALREADY_EXISTS("Record already exists."),
	INTERNAL_SERVER_ERROR("Internal server error");
	
	private String errorMessage;
	
	ErrorMessages(String error) {
		this.errorMessage = error;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}