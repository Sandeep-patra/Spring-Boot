package in.Ashokit.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Ashokit.jdbc.DBService;

public class Text {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
 				DBService bean = context.getBean(DBService.class);
		bean.add();
	}

}
