package br.ws.ui.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.ws.ui.model.response.ErrorMessage;
import com.ws.ui.model.response.ErrorMessages;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Throwable> {

	public Response toResponse(Throwable exception) {
		
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), ErrorMessages.INTERNAL_SERVER_ERROR.name(), "hhtp...documentation");
		
		return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}	
}
