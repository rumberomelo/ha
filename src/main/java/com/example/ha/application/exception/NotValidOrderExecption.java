package com.example.ha.application.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class NotValidOrderExecption extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
