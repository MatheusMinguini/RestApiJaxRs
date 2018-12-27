package br.ws.ui.entrypoint;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.BeanUtils;

import com.ws.ui.dto.UserDTO;
import com.ws.ui.model.request.CreateUserRequestModel;
import com.ws.ui.model.response.UserResponse;
import com.ws.ui.service.UserService;
import com.ws.ui.service.implementation.UserServiceImplementation;


@Path("/users") //The resource in the URI
public class UsersEntryPoint {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON) //Defines which media type this method accepts
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML}) //Defines which media type this method will have as a response
	public UserResponse createUser(CreateUserRequestModel requestObject) {
		UserResponse returnValue = new UserResponse();
		
		//Prepare userDTO
		UserDTO userDto = new UserDTO();
		BeanUtils.copyProperties(requestObject, userDto); //This method copies one object into another object, only the properties THAT MATCH
		//In this example above, I am copying the requestObject into userDto object, but only the properties that match
		
		
		// Create new user
		UserService userService = new UserServiceImplementation();
		UserDTO createdUserProfile = userService.createUser(userDto);
		
		//prepare response
		BeanUtils.copyProperties(createdUserProfile, returnValue);
		
		return returnValue;
	}
}
