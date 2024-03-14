package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		Robot robo=context.getBean(Robot.class);
		robo.function();
		System.out.println(robo);
	
	}

}
