package com.common.user.dtos;

import java.io.Serializable;

public class ResponseObject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -9007483288839938120L;
	private String responseCode;
	private String responseMessage;
	private long timeStamp;
	
	
	@Override
	public String toString() {
		return "ResponseObject [responseCode=" + responseCode + ", responseMessage=" + responseMessage + ", timeStamp="
				+ timeStamp + "]";
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
