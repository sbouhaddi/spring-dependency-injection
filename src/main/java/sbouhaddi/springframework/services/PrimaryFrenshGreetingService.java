package sbouhaddi.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("fr")
public class PrimaryFrenshGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		
		return "Salutation Primaire !!";
	}

	
	
}
