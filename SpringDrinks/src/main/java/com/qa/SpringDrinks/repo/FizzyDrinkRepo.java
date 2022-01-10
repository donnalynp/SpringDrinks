package com.qa.SpringDrinks.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.SpringDrinks.domain.FizzyDrink;

public interface FizzyDrinkRepo extends JpaRepository<FizzyDrink, Long>{

}
