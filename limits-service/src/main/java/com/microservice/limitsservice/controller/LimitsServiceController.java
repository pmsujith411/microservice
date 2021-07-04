package com.microservice.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.limitsservice.bean.Limits;
import com.microservice.limitsservice.configuration.LimitsConfiguration;

@RestController
public class LimitsServiceController 
{
	@Autowired
	LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public Limits getLimits()
	{
		return new Limits(limitsConfiguration.getMinimum(), limitsConfiguration.getMaximum());
	}
}
