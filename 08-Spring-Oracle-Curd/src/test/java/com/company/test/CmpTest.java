package com.company.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.company.service.CompanyService;

public class CmpTest {
  
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("OJdbcBeans.xml");
		CompanyService service = context.getBean(CompanyService.class);
		service.saveCompany(108, "Sony", "Delhi");
		System.out.println("======================");
		service.findcompany(107);
		System.out.println("======================");
		service.findAll();
		System.out.println("======================");
		service.delete(108);
		System.out.println("======================");
		service.updateCompany(102,"Delote","hydrabad");

	}

}
