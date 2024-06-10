package com.demomicroa.demoforservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demomicroa.demoforservice.entity.EntityClass;
import com.demomicroa.demoforservice.repository.HomeRepository;

@Service
public class HomeService {
	
	@Autowired
	HomeRepository homeRepo;

	public void View(EntityClass entityclass) {
	homeRepo.save(entityclass);	
		
	}

}
