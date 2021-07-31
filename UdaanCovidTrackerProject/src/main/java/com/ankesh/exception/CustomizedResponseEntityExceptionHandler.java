package com.ankesh.exception;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
//helps in implementing common things across controller
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler({Exception.class, NoValueException.class})
	public final ResponseEntity<ExceptionResponse> handleExceptions(Exception ex, WebRequest req){
		System.out.println("ankesh generic exception");
		if(ex instanceof NoValueException) {
			System.out.println("ankesh exception");
			ExceptionResponse exceptionresponse = new ExceptionResponse(new Date(),ex.getMessage(),req.getDescription(false));
			return new ResponseEntity<>(exceptionresponse,HttpStatus.NOT_FOUND);
		}
		else {
		ExceptionResponse exceptionresponse = new ExceptionResponse(new Date(),ex.getMessage(),req.getDescription(false));
		return new ResponseEntity<>(exceptionresponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
