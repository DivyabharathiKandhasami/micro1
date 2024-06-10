package com.demomicroa.demoforservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.demomicroa.demoforservice.entity.EntityClass;
import com.demomicroa.demoforservice.service.HomeService;

@RestController
@RequestMapping("/api")
public class HomeController {
	
	@Autowired
   private 	RestTemplate resttemplate;
	
	@Autowired
	HomeService homeService;
	
	@GetMapping("/home")
	public String home()
	{
		
		
    //return "Home Page";	
	String products	= resttemplate.getForObject("http://localhost:8082/api/start/products", String.class);
	return products;
	}

	@PostMapping
	public String View(@RequestBody EntityClass entityclass ) {
	homeService.View(entityclass);
	return "Microservice view demo";
}
}                                                     