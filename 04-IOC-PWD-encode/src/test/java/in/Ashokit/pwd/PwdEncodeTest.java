package in.Ashokit.pwd;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.Ashokit.PwdEncode;

public class PwdEncodeTest {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("PwdEncode.xml");
		PwdEncode bean = context.getBean(PwdEncode.class);
		String encodePwd=bean.encode("Sandeep@24");
		System.out.println("Encoded pwd : "+encodePwd);
	}

}
