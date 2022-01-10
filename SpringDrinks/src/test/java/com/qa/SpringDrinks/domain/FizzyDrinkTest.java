package com.qa.SpringDrinks.domain;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class FizzyDrinkTest {
	
	@Test
	public void testEquals() {
	EqualsVerifier.forClass(FizzyDrink.class).usingGetClass().verify();
	}
	
	@Test
	public void noIdConstructor() {
		FizzyDrink fizzydrink = new FizzyDrink("Dr Pepper", "Keurig Dr Pepper", 1.50, "2l");
		
		//testing that there are no null fields
		assertNotNull(fizzydrink.getName());
		assertNotNull(fizzydrink.getManufacturer());
		assertNotNull(fizzydrink.getPrice());
		assertNotNull(fizzydrink.getAmount());
		
		assertEquals(fizzydrink.getName(), "Dr Pepper");
		assertEquals(fizzydrink.getManufacturer(), "Keurig Dr Pepper");
		assertEquals(fizzydrink.getPrice(), 1.50);
		assertEquals(fizzydrink.getAmount(), "2l");
	}
	
	@Test
	public void settersTest() {
		FizzyDrink fizzydrink = new FizzyDrink();
		
		fizzydrink.setName("Tango Orange");
		fizzydrink.setManufacturer("Britvic");
		fizzydrink.setPrice(1.65);
		fizzydrink.setAmount("2l");
		
		assertNotNull(fizzydrink.getName());
		assertNotNull(fizzydrink.getManufacturer());
		assertNotNull(fizzydrink.getPrice());
		assertNotNull(fizzydrink.getAmount());
		
		assertEquals(fizzydrink.getName(), "Tango Orange");
		assertEquals(fizzydrink.getManufacturer(), "Britvic");
		assertEquals(fizzydrink.getPrice(), 1.65);
		assertEquals(fizzydrink.getAmount(), "2l");
		
	}
}
