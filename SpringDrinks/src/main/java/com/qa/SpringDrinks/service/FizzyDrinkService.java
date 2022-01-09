package com.qa.SpringDrinks.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.SpringDrinks.domain.FizzyDrink;
import com.qa.SpringDrinks.repo.FizzyDrinkRepo;

@Service
public class FizzyDrinkService implements ServiceMethods<FizzyDrink>{

	private FizzyDrinkRepo repo;
	
	//Constructor
	public FizzyDrinkService(FizzyDrinkRepo repo) {
		this.repo = repo;
	}
	
	@Override
	public FizzyDrink create(FizzyDrink fizzyDrink) {
		return this.repo.save(fizzyDrink);
	}

	@Override
	public List<FizzyDrink> getAll() {
		return this.repo.findAll();
	}

	@Override
	public FizzyDrink getById(long id) {
		Optional<FizzyDrink> optionalFizzyDrink = this.repo.findById(id);
		if(optionalFizzyDrink.isPresent()) {
			return optionalFizzyDrink.get();
		}
		return null;
	}

	@Override
	public FizzyDrink update(long id, FizzyDrink fizzyDrink) {
		Optional<FizzyDrink> existingFizzyDrink = this.repo.findById(id);
		if(existingFizzyDrink.isPresent()) {
			FizzyDrink existing = existingFizzyDrink.get();
			existing.setName(fizzyDrink.getName());
			existing.setManufacturer(fizzyDrink.getManufacturer());
			existing.setPrice(fizzyDrink.getPrice());
			existing.setAmount(fizzyDrink.getAmount());
			
			return this.repo.saveAndFlush(existing);
		}
		
		return null;
	}

	@Override
	public boolean delete(long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

}
