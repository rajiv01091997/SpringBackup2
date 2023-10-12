package com.globallogic.Exceptions;
import java.time.LocalDateTime;

public class ErrorInfo {
private LocalDateTime timeStamp;
private String message;
private String details;
public ErrorInfo() {
	super();
	// TODO Auto-generated constructor stub
}

public ErrorInfo(LocalDateTime timeStamp, String message, String details) {
	super();
	this.timeStamp = timeStamp;
	this.message = message;
	this.details = details;
}

public LocalDateTime getTimeStamp() {
	return timeStamp;
}
public void setTimeStamp(LocalDateTime timeStamp) {
	this.timeStamp = timeStamp;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}

@Override
public String toString() {
	return "ErrorInfo [timeStamp=" + timeStamp + ", message=" + message + ", details=" + details + "]";
}

}
