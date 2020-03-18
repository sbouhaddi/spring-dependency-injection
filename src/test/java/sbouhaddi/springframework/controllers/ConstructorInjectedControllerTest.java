package sbouhaddi.springframework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sbouhaddi.springframework.constrollers.ConstructorInjectedController;
import sbouhaddi.springframework.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constructorInjectedController;
	
	@BeforeEach
	public void setUp() {
		
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
		
	}
	
	@Test
	public void testGreeting () throws Exception {
		
		assertEquals(GreetingServiceImpl.HELLO_WORLD, constructorInjectedController.sayHello());
	}
	
}
