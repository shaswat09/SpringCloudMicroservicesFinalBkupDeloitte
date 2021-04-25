package com.example.demo;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuredService {
	
	@Autowired
	private  KieContainer kieContainer;

	public Vehicle getProductDiscount(Vehicle vehicle) {
		//get the stateful session
		KieSession kieSession = kieContainer.newKieSession("rulesSession");
		kieSession.insert(vehicle);
		kieSession.fireAllRules();
		kieSession.dispose();
		return vehicle;
	}
}
