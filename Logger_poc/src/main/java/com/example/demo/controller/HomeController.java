package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private static final Logger Logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/logs")		
	public String demoLogs() 
	{
	
		Logger.error("This is error event");
		Logger.warn("This is warn event..");
		Logger.info("This is info event");
		
		
		return "logger concept...";
		
	}
}
