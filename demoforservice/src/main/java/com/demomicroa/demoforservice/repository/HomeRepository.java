package com.demomicroa.demoforservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demomicroa.demoforservice.entity.EntityClass;

@Repository
public interface HomeRepository extends JpaRepository <EntityClass, Long>{
	
	
	

}
