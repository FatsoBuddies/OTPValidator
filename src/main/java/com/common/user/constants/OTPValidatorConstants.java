package com.common.user.constants;

public interface OTPValidatorConstants {
   String AUTHKEY="250722A497JfX9p5c094e68";
   String MESSEAGE_FOR_SENDING_OTP="Your Verification Code is ##OTP##";
   String SENDER_DETAILS="777777";
   String BASE_URL="http://control.msg91.com/api/sendotp.php?";
   String URL_ATTRIBUTES_AUTHKEY="authkey";
   String URL_ATTRIBUTES_MESSEAGE_PLACEHOLDER="message";
   String URL_ATTRIBUTES_SENDER_DETAILS="sender";
   String URL_ATTRIBUTES_CUSTOMER_MOBILE="mobile";
   String REQUEST_METHOD_POST="POST";
   String REQUEST_PROPERTY="application/json";
   String REQUEST_PROPERTY_ACCEPT="Accept";
   String URI_ATTRIBUTES_OTP="otp";
}
