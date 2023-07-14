/**
 * 
 */
package com.devsuperior.cliente.controllers.handlers;

import java.time.Instant;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.cliente.dto.CustomErro;
import com.devsuperior.cliente.dto.ValidationError;
import com.devsuperior.cliente.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;

/**
 * @author matheus
 *
 */
@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<CustomErro> customName(ResourceNotFoundException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.NOT_FOUND;
		CustomErro err = new CustomErro(Instant.now(), status.value(), e.getMessage(), request.getRequestURI());
	return ResponseEntity.status(status).body(err);
	}
	
	
	
	@ExceptionHandler(ConstraintViolationException.class)
	public ResponseEntity<CustomErro> methodArgumentexception(ConstraintViolationException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;
		ValidationError err = new ValidationError(Instant.now(), status.value(),"Dados inválidos!", request.getRequestURI());
		
		 Set<ConstraintViolation<?>> violations = e.getConstraintViolations();
		 for (ConstraintViolation<?> violation : violations) {
		        String propertyPath = violation.getPropertyPath().toString();
		        String message = violation.getMessage();
		        String invalidValue = violation.getInvalidValue().toString();
		        
		        
		    err.addError(propertyPath, message,invalidValue);
		      
		    }
		
	return ResponseEntity.status(status).body(err);
	}
	
	

}
