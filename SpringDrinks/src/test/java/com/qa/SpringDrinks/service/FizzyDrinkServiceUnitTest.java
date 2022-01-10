package com.qa.SpringDrinks.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.SpringDrinks.domain.FizzyDrink;
import com.qa.SpringDrinks.repo.FizzyDrinkRepo;


@SpringBootTest
public class FizzyDrinkServiceUnitTest {

	@Autowired
	private FizzyDrinkService service;
		
	@MockBean
	private FizzyDrinkRepo repo;
		
	@Test
	public void createTest() {
		FizzyDrink input = new FizzyDrink ("Sprite", "The Coca-Cola Company", 1.00, "2l");
		FizzyDrink output = new FizzyDrink (1L, "Sprite", "The Coca-Cola Company", 1.00, "2l");
			
		Mockito.when(this.repo.save(input)).thenReturn(output);
			
		assertEquals(output,this.service.create(input));
			
		Mockito.verify(this.repo, Mockito.times(1)).save(input);
			
		}
		
		
}


