package in.Ashokit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component

public class CarService {
	@Autowired
	@Qualifier("harrier")
	private ICar car;
	public  void carService() {
		car.start();
	}
	
	
}
