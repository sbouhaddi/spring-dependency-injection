package sbouhaddi.springframework.constrollers;

import org.springframework.stereotype.Controller;

import sbouhaddi.springframework.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	

	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() 
	{
		return greetingService.sayGreeting();
	}

}
