package in.AshokIt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Ashokit.Service.IBookServiceImpl;

public class CurdTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("curdBeans.xml");
		IBookServiceImpl service = context.getBean(IBookServiceImpl.class);
		service.save();
		System.out.println("-------------");
		service.findById();
		System.out.println("-------------");
		service.update();
		System.out.println("-------------");
		service.findAll();
		ConfigurableApplicationContext cotex=(ConfigurableApplicationContext)context;
		cotex.close();
	}

}
