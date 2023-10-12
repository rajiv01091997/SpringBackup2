package com.globallogic.Exceptions;

public class CategoryNotFound extends RuntimeException {
	String msg;

	public CategoryNotFound(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
