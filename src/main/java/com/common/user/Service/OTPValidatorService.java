package com.common.user.Service;

import org.springframework.stereotype.Service;

import com.common.user.dtos.ResponseObject;
@Service("otpValidatorService")
public interface OTPValidatorService {
	public ResponseObject sendOTP(String urlFormed) ;
	public ResponseObject verifyOTP(String urlFormed);
}
