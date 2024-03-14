package in.Ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.Ashokit.Service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		ProductService ps = ctxt.getBean(ProductService.class);
		//ps.saveProduct();
		ps.saveProducts();
		//ps.getProduct();
		//ps.getProducts();
		//ps.getAllProduct();
		//ps.getIfPresent();
		//ps.checkNoOfProduct();
		ps.deleteProduct();
		
		
	}
	
}
 