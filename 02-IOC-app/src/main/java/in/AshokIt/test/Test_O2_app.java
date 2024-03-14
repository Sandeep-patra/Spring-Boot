package in.AshokIt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.AshokIt.service.IUserService;
public class Test_O2_app {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IUserService bean = context.getBean(IUserService.class);
		String name = bean.getName(100);
		System.out.println(name);

	}

}
