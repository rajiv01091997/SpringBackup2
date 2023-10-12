package com.globallogic.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorInfo {
private LocalDateTime time;
private HttpStatus status;
private String msg;
private String details;
public ErrorInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public ErrorInfo(LocalDateTime time, HttpStatus status, String msg, String details) {
	super();
	this.time = time;
	this.status = status;
	this.msg = msg;
	this.details = details;
}
public LocalDateTime getTime() {
	return time;
}
public void setTime(LocalDateTime time) {
	this.time = time;
}
public HttpStatus getStatus() {
	return status;
}
public void setStatus(HttpStatus status) {
	this.status = status;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
@Override
public String toString() {
	return "ErrorInfo [time=" + time + ", status=" + status + ", msg=" + msg + ", details=" + details + "]";
}

}
