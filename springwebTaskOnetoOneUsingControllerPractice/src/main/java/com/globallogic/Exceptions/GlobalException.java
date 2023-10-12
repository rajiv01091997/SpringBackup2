package com.globallogic.Exceptions;



import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalException {
	
@ExceptionHandler(IdNotFoundException.class)	
public ResponseEntity<ErrorInfo> IdNotFound(IdNotFoundException e,WebRequest webRequest)
{
	ErrorInfo errorInfo=new ErrorInfo();
	errorInfo.setTimeStamp(LocalDateTime.now());
	errorInfo.setMessage(e.getMsg());
	errorInfo.setDetails(webRequest.getDescription(false));
	return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.NOT_FOUND);
}

//for application exception
@ExceptionHandler(Exception.class)
public ResponseEntity<ErrorInfo> exception(Exception e, WebRequest webRequest)
{
	ErrorInfo errorInfo=new ErrorInfo();
	errorInfo.setTimeStamp(LocalDateTime.now());
	errorInfo.setMessage(e.getMessage());
	errorInfo.setDetails(webRequest.getDescription(false));
	return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.NOT_FOUND);
}
}
