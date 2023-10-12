package com.globallogic.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<ErrorInfo> exception(IdNotFoundException e, WebRequest webRequest)
	{   
		ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setTime(LocalDateTime.now());
		errorInfo.setStatus(HttpStatus.NOT_FOUND);
		errorInfo.setMsg(e.getMsg());
		errorInfo.setDetails(webRequest.getDescription(false));
		return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.NOT_FOUND );
		
	}
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorInfo> parentException(Exception e,WebRequest webRequest)
    {
    	
    	ErrorInfo errorInfo=new ErrorInfo();
		errorInfo.setTime(LocalDateTime.now());
		errorInfo.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
		errorInfo.setMsg(e.getMessage());
		errorInfo.setDetails(webRequest.getDescription(false));
		return new ResponseEntity<ErrorInfo>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
		
    	
    }
	
}
