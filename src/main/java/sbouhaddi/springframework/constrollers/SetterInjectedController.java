package sbouhaddi.springframework.constrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import sbouhaddi.springframework.services.GreetingService;

@Controller
public class SetterInjectedController {

	public GreetingService greetingServiceImpl;
	
	public String sayHello() {
		return greetingServiceImpl.sayGreeting();
	}

	@Autowired
	public void setGreetingServiceImpl(@Qualifier("getterGreetingService") GreetingService greetingServiceImpl) {
		this.greetingServiceImpl = greetingServiceImpl;
	}
	
	
}
