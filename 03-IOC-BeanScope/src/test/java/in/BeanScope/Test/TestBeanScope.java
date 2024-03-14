package in.BeanScope.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.BeanScope.Car;
import in.BeanScope.IVehicles;
import in.BeanScope.Tractor;

public class TestBeanScope {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeanScope.xml");
		IVehicles v1 = context.getBean(Car.class);
		IVehicles v2 = context.getBean(Car.class);
//		IVehicles v3 = context.getBean(Car.class);
		IVehicles tv1 = context.getBean(Tractor.class);
		IVehicles tv2 = context.getBean(Tractor.class);
//		System.out.println(v1.hashCode());
//		System.out.println(v2);
//		System.out.println(v3);
//		System.out.println(tv1);
//		System.out.println(tv2);
		v1.drive();
		tv1.drive();
		
		ConfigurableApplicationContext contex=(ConfigurableApplicationContext)context;
		contex.close();
		
		
	}

}
