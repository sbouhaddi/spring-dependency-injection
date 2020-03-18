package sbouhaddi.springframework.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sbouhaddi.springframework.constrollers.SetterInjectedController;
import sbouhaddi.springframework.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {

	
	private SetterInjectedController setterInjectedController;
	
	@BeforeEach
	public void setUp() {
		
		this.setterInjectedController = new SetterInjectedController();
		this.setterInjectedController.setGreetingServiceImpl(new GreetingServiceImpl());
		
	}
	
	@Test
	public void testGreeting () throws Exception {
		
		assertEquals(GreetingServiceImpl.HELLO_WORLD, setterInjectedController.sayHello());
	}
}
