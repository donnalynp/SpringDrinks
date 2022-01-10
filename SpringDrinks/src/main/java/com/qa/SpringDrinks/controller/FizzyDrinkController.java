package com.qa.SpringDrinks.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.SpringDrinks.domain.FizzyDrink;
import com.qa.SpringDrinks.service.FizzyDrinkService;

@RestController
@RequestMapping("/fizzydrink")
public class FizzyDrinkController {

	private FizzyDrinkService service;
	
	private FizzyDrinkController(FizzyDrinkService service) {
		this.service = service;
	}
	
	//Create
	@PostMapping("/create")
	public ResponseEntity<FizzyDrink> createFizzyDrink (@RequestBody FizzyDrink fizzyDrink){
		return new ResponseEntity<FizzyDrink>(this.service.create(fizzyDrink), HttpStatus.CREATED);
	}
	
	//Read All
	@GetMapping("/readAll")
	public ResponseEntity<List<FizzyDrink>> readAllFizzyDrink(){
		return new ResponseEntity<List<FizzyDrink>>(this.service.getAll(), HttpStatus.OK);
	}
	
	//Read By Id
	@GetMapping("/readById/{id}")
	public ResponseEntity<FizzyDrink>readFizzyDrinkById(@PathVariable long id){
		return new ResponseEntity<FizzyDrink>(this.service.getById(id), HttpStatus.OK);
	}
	
	//Update
	@PutMapping("/update/{id}")
	public ResponseEntity<FizzyDrink> updateFizzyDrink(@PathVariable long id, @RequestBody FizzyDrink fizzydrink){
		return new ResponseEntity<FizzyDrink>(this.service.update(id, fizzydrink), HttpStatus.ACCEPTED);
	}
	
	//Delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteFizzyDrink(@PathVariable long id){
		return (this.service.delete(id)) ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}

