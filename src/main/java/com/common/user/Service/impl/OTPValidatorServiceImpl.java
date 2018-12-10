package com.common.user.Service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;

import com.common.user.Service.OTPValidatorService;
import com.common.user.constants.OTPValidatorConstants;
import com.common.user.dtos.ResponseObject;

public class OTPValidatorServiceImpl implements OTPValidatorService,OTPValidatorConstants {

	@Override
	public ResponseObject sendOTP(String urlFormed) {
		HttpURLConnection conn = null;
		String responseMessage;
		ResponseObject responseObject=new ResponseObject();
		try {
			URL url = new URL(urlFormed);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod(REQUEST_METHOD_POST);
			conn.setRequestProperty(REQUEST_PROPERTY_ACCEPT, REQUEST_PROPERTY);
			if (conn.getResponseCode() != 200) {
				responseObject.setResponseCode(Integer.toString(conn.getResponseCode()));
				responseObject.setResponseMessage(conn.getResponseMessage());
				responseObject.setTimeStamp(System.currentTimeMillis());
			} else {
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

				while ((responseMessage = br.readLine()) != null) {
					
					responseObject.setResponseMessage(responseMessage);
				}
				responseObject.setResponseCode(Integer.toString(conn.getResponseCode()));
				responseObject.setTimeStamp(System.currentTimeMillis());
			}
			
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return responseObject;
	}

	@Override
	public ResponseObject verifyOTP(String urlFormed) {

		HttpURLConnection conn = null;
		String responseMessage;
		ResponseObject responseObject=new ResponseObject();
		try {
			URL url = new URL(urlFormed);
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Accept", "application/json");
			if (conn.getResponseCode() != 200) {
				responseObject.setResponseCode(Integer.toString(conn.getResponseCode()));
				responseObject.setResponseMessage(conn.getResponseMessage());
				responseObject.setTimeStamp(System.currentTimeMillis());
			} else {
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

				while ((responseMessage = br.readLine()) != null) {
					
					responseObject.setResponseMessage(responseMessage);
				}
				responseObject.setResponseCode(Integer.toString(conn.getResponseCode()));
				responseObject.setTimeStamp(System.currentTimeMillis());
			}
			System.out.println(responseObject.toString());
			conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return responseObject;
	
	}
	


}
