package com.example.myAngularApp.exception;

import javax.management.RuntimeErrorException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeErrorException {

	public ResourceNotFoundException(Error message ) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
