package in.Autowiring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Ashokit.Autowiring.ATM;

public class AutoWiringTestApp {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("AutowiringBeans.xml");
		ATM atm=context.getBean(ATM.class);
		atm.withdrow();

	}

}
