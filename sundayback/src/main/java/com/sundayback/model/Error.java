package com.sundayback.model;

public class Error {
	int errorcde;
	String errorMsg;
	public Error(int errorcde, String errorMsg) {
		super();
		this.errorcde = errorcde;
		this.errorMsg = errorMsg;
	}
	public int getErrorcde() {
		return errorcde;
	}
	public void setErrorcde(int errorcde) {
		this.errorcde = errorcde;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
