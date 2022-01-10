package com.qa.SpringDrinks.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.SpringDrinks.domain.FizzyDrink;
import com.qa.SpringDrinks.service.FizzyDrinkService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class FizzyDrinkControllerUnitTest {

	@Autowired
	public MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
	
	@MockBean
	private FizzyDrinkService service;
	
	@Test
	public void createTest() throws Exception {
		FizzyDrink entry = new FizzyDrink("Dr Pepper Zero", "Keurig Dr Pepper", 1.50, "2l");
		String entryAsJSON = this.mapper.writeValueAsString(entry);
	
		Mockito.when(this.service.create(entry)).thenReturn(entry);
		
		mvc.perform(post("/fizzydrink/create")
		.contentType(MediaType.APPLICATION_JSON)
		.content(entryAsJSON))
		.andExpect(status().isCreated())
		.andExpect(content().json(entryAsJSON));
	}
}
