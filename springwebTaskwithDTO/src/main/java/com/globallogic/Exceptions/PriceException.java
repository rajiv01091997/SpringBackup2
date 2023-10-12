package com.globallogic.Exceptions;

public class PriceException extends RuntimeException {

	String msg;

	public PriceException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
}
