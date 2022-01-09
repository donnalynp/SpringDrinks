package com.qa.SpringDrinks.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringDrinks.service.FizzyDrinkService;

@RestController
@RequestMapping()
public class FizzyDrinkController {

	private FizzyDrinkService service;
	
	private FizzyDrinkController(FizzyDrinkService service) {
		this.service = service;
	}
	
	//Create
	
}

