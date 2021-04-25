package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InsuredController {

	@Autowired
	private InsuredService insuredService;
	
	@RequestMapping(value = "/getDiscount", method = RequestMethod.POST, produces = "application/json")
	public Vehicle getQuestions(@RequestBody Vehicle vehicle) {

		insuredService.getProductDiscount(vehicle);
		return vehicle;
	}
}
