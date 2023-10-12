package com.globallogic.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> idNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMsg(), HttpStatus.OK);
	}

	@ExceptionHandler(CategoryNotFound.class)
	public ResponseEntity<String> categoryNotPresent(CategoryNotFound e) {
		return new ResponseEntity<String>(e.getMsg(), HttpStatus.OK);
	}

	@ExceptionHandler(PriceException.class)
	public ResponseEntity<String> priceBelowRange(PriceException e) {
		return new ResponseEntity<String>(e.getMsg(), HttpStatus.OK);
	}

}
