package br.ws.ui.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.ws.ui.model.response.ErrorMessage;
import com.ws.ui.model.response.ErrorMessages;


@Provider
public class MissingrequiredFieldExceptionMapper implements ExceptionMapper<MissingRequiredFieldException> {

	public Response toResponse(MissingRequiredFieldException exception) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), ErrorMessages.MISSING_REQUIRED_FIELD.name(), "hhtp...");
		return Response.status(Response.Status.BAD_REQUEST).entity(errorMessage).build();
	}
}
