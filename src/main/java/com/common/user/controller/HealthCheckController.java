package com.common.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/health")
public class HealthCheckController {
	@RequestMapping(method=RequestMethod.GET)
	public void healthcheck() {
		System.out.println("Application is UP.");
	}
}
