package com.qa.SpringDrinks;

import org.junit.jupiter.api.Test;

import com.qa.SpringDrinks.domain.FizzyDrink;

import nl.jqno.equalsverifier.EqualsVerifier;

public class FizzyDrinkTest {
	
	@Test
	public void testEquals() {
	EqualsVerifier.forClass(FizzyDrink.class).usingGetClass().verify();
	
	}
}
