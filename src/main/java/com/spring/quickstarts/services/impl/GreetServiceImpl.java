package com.spring.quickstarts.services.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.spring.quickstarts.services.GreetService;

@Service
@Configuration
public class GreetServiceImpl implements GreetService {

	public String getGreet(String name) {
		if(name == null) {
			return "greet";
		} else {
			return "greet";
		}
	}
	
	@Bean(name = "greetService")
	public GreetService getGreetService() {
		return new GreetServiceImpl();
	}
	
}
