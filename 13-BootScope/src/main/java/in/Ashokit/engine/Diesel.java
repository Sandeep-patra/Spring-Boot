package in.Ashokit.engine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Configuration
public class Diesel implements IEngine {

	@Override
	public void running() {
		System.out.println("Diesel engine is Stsrted");

	}
	@Bean
	@Primary
	public  Cng getCng() {
		Cng cng= new Cng();
		cng.setCngCapacity(100);
		return cng;
	}

}
