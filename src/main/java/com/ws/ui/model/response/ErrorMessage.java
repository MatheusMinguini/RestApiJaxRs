package com.ws.ui.model.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	
	private String errorMessage;
	private String errorMessageKey;
	private String link; //Link to documentation page if necessary
	
	public ErrorMessage(String errorMessage, String errorMessageKey, String link ){
		this.errorMessage = errorMessage;
		this.errorMessageKey = errorMessageKey;
		this.link = link;
	}
	
	public ErrorMessage(){
		
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessageKey() {
		return errorMessageKey;
	}

	public void setErrorMessageKey(String errorMessageKey) {
		this.errorMessageKey = errorMessageKey;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
