package com.ws.ui.service.implementation;

import com.ws.ui.dto.UserDTO;
import com.ws.ui.model.response.ErrorMessages;
import com.ws.ui.service.UserService;

import br.ws.ui.dao.DAO;
import br.ws.ui.dao.implementation.MySQLImplementation;
import br.ws.ui.exceptions.CouldNotCreateRecordException;
import br.ws.ui.utils.UserUtils;

public class UserServiceImplementation implements UserService{
	
	DAO database;
	
	public UserServiceImplementation() {
		this.database = new MySQLImplementation();
	}
	
	UserUtils userUtils = new UserUtils();

	public UserDTO createUser(UserDTO userPayLoad) {
		// Validate the required fields
		userUtils.validateRequiredFields(userPayLoad);
		
		//Check if user already exists
		UserDTO existingUser = getUserByUserName(userPayLoad.getEmail());
		if(existingUser != null) {
			throw new CouldNotCreateRecordException(ErrorMessages.RECORD_ALREADY_EXISTS.name());
		}
		
		// Create an Entity object 
		
		// Generate secure public user id
		
		// Generate salt (the id which the frontend will consume)
		
		
		
		// Generate secure password
		
		// Finally store data into a database
		
		// Return back the user profile
		
		return null;
	}
	
	
	private UserDTO getUserByUserName(String username) {
		return database.getuserByUserName(username);
	}

}
