package com.demomicroa.demoforservice.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HomeConfig {   
	
	 //to call all the products
   @Bean //annotated bean will be added in spring context you will just @Autowired it.
	public RestTemplate getRest() {	
		RestTemplate resttemplate = new RestTemplate();
	    return resttemplate;
	}
	// to add the dependency of edureka service in codebuffer
	
}
