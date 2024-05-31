package io.github.filipegabriel.clientesbackend.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import jakarta.servlet.http.HttpServletRequest;

import java.time.Instant;

import org.hibernate.PropertyValueException;

@ControllerAdvice
public class ResourceException {
	
	@ExceptionHandler(PropertyValueException.class)
	public ResponseEntity<StandardError> PropertyValue(PropertyValueException e, HttpServletRequest request){
		String error = "Not-null property references a null or transient value";
		HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
		StandardError newError = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(newError);
	}
	
	
	
}
