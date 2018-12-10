/**
 * 
 */
package com.common.user.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.common.user.Service.OTPValidatorService;
import com.common.user.Service.impl.OTPValidatorServiceImpl;
import com.common.user.constants.OTPValidatorConstants;
import com.common.user.dtos.ResponseObject;

/**
 * @author Rwik
 *
 */
@RestController
@RequestMapping(value = "/otpvalidator")
public class OTPValidatorController implements OTPValidatorConstants{
	
	
	OTPValidatorService otpValidatorService;
	@RequestMapping(value = "/sendotp/{mobile}", method = RequestMethod.GET)
	public ResponseObject sendOTP(@PathVariable String mobile) {
		ResponseObject responseObject=null;
		try {
			Map<String, String> uriParams = new HashMap<>();
			uriParams.put(AUTHKEY, "250722A497JfX9p5c094e68");
			uriParams.put(URL_ATTRIBUTES_MESSEAGE_PLACEHOLDER, "Your Verification Code is ##OTP##");
			uriParams.put(URL_ATTRIBUTES_SENDER_DETAILS, "777777");
			uriParams.put(URL_ATTRIBUTES_CUSTOMER_MOBILE,mobile);					
			StringBuilder urlFormed = new StringBuilder();
			urlFormed.append(BASE_URL).append("authkey={authkey}").append("&").append("messeges={message}").append("&")
					.append("sender={sender}").append("&").append("mobile={mobile}");
			OTPValidatorService otpValidatorService=new OTPValidatorServiceImpl(); 
		 responseObject=otpValidatorService.sendOTP(urlFormed.toString());			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseObject;
	}

	@RequestMapping(value = "/validateotp", method = RequestMethod.GET)
	public ResponseObject verifyOtp() {
		ResponseObject responseObject=null;
		try {
			Map<String, String> uriParams = new HashMap<>();
			uriParams.put(URL_ATTRIBUTES_AUTHKEY, "250722A497JfX9p5c094e68");
			uriParams.put(URL_ATTRIBUTES_CUSTOMER_MOBILE,"+919739917200");	
			uriParams.put(URI_ATTRIBUTES_OTP, "8233");
			StringBuilder urlFormed = new StringBuilder();
			String baseUrl = "https://control.msg91.com/api/verifyRequestOTP.php?";
			urlFormed.append(baseUrl).append("authkey={authkey}").append("&").append("mobile={mobile}").append("otp={otp}");
			OTPValidatorService otpValidatorService=new OTPValidatorServiceImpl(); 
			responseObject=otpValidatorService.verifyOTP(urlFormed.toString());
			System.out.println(responseObject.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return responseObject;
	}
}