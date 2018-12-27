package br.ws.ui.exceptions;

public class MissingRequiredFieldException extends RuntimeException{
	
	public MissingRequiredFieldException(String message) {
		super(message);
	}
}
