package com.globallogic.Exceptions;

public class IdNotFoundException extends RuntimeException{
	String msg;

	public IdNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	

}