package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		
		RestaurantService service=context.getBean(RestaurantService.class);
		service.collectPayment(5750);
	}

}
