package service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.SpringDrinks.domain.FizzyDrink;
import com.qa.SpringDrinks.repo.FizzyDrinkRepo;
import com.qa.SpringDrinks.service.FizzyDrinkService;

@RunWith(MockitoJUnitRunner.class)
public class FizzyDrinkServiceUnitTest {

	@InjectMocks
	private FizzyDrinkService service;
	
	@Mock
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
