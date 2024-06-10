package com.demomicroa.demoforservice.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HomeConfig { 
	
	 // to call all the products
    @Bean
	public RestTemplate getRest() {	
		RestTemplate resttemplate = new RestTemplate();
	    return resttemplate;
	}
	
	
}
