package br.ws.ui.utils;

import java.util.UUID;

import com.ws.ui.dto.UserDTO;
import com.ws.ui.model.response.ErrorMessages;

import br.ws.ui.exceptions.MissingRequiredFieldException;

public class UserUtils {

	public void validateRequiredFields (UserDTO userDto) {
		Boolean valid = Boolean.TRUE;
		if(userDto.getFirstName()== null || userDto.getFirstName().isEmpty()) {
			 valid = Boolean.FALSE;
		}
		
		if(userDto.getLastName() == null || userDto.getLastName().isEmpty()) {
			 valid = Boolean.FALSE;
		}
		
		if(userDto.getEmail() == null || userDto.getEmail().isEmpty()) {
			 valid = Boolean.FALSE;
		}
		
		if(userDto.getPassword() == null || userDto.getPassword().isEmpty()) {
			 valid = Boolean.FALSE;
		}
		
		if(!valid) {
			throw new MissingRequiredFieldException(ErrorMessages.MISSING_REQUIRED_FIELD.getErrorMessage());
		}
	}
	
	
	
	/* A UUID (Universal Unique Identifier) is a 128-bit number used to uniquely identify some object or entity on the Internet.
	 * UUID is either guaranteed to be different or is, at least, extremely likely to be different from any other UUID generated
	 */
	
	public String generateUUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
