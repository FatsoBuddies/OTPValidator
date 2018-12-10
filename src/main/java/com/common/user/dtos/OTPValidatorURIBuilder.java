package com.common.user.dtos;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class OTPValidatorURIBuilder implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7146052687871661099L;
	private Map<String, String> uriParams = new HashMap<>();
	private String finalUrlFormed;
	private long timeStamp;
	
	
	public Map<String, String> getUriParams() {
		return uriParams;
	}
	public void setUriParams(Map<String, String> uriParams) {
		this.uriParams = uriParams;
	}
	public String getFinalUrlFormed() {
		return finalUrlFormed;
	}
	public void setFinalUrlFormed(String finalUrlFormed) {
		this.finalUrlFormed = finalUrlFormed;
	}
	public long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
