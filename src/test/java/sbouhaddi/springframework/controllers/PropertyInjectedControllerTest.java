package sbouhaddi.springframework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sbouhaddi.springframework.constrollers.PropertyInjectedController;
import sbouhaddi.springframework.services.GreetingServiceImpl;


public class PropertyInjectedControllerTest {

	private PropertyInjectedController propertyInjectedController;
	
	@BeforeEach
	public void setUp() {
		
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
		
	}
	
	@Test
	public void testGreeting () throws Exception {
		
		assertEquals(GreetingServiceImpl.HELLO_WORLD, propertyInjectedController.sayHello());
	}
	
}
