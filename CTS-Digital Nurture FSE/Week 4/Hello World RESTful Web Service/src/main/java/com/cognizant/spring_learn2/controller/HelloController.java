package com.cognizant.spring_learn2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class HelloController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@GetMapping("/hello")
	public String sayHello() {
		LOGGER.info("START: sayHello()");
        String response = "Hello World!!";
        LOGGER.info("END: sayHello()");
        return response;
	}

}
