package in.Ashokit.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import in.Ashokit.Product;
import in.Ashokit.ProductRepositry;

@Service
public class ProductService {
	private ProductRepositry pRepo;
	
	public ProductService(ProductRepositry pRepo) {
		this.pRepo = pRepo;
	}
	Scanner sc=new Scanner(System.in);
	public void saveProduct() {
		Product p=new Product();
		System.out.println("Enter the Product Id ");
		p.setPid(sc.nextInt());
		System.out.println("Enter the Product Name ");
		p.setpName(sc.next());
		System.out.println("Enter the Product Price ");
		p.setPrice(sc.nextDouble());
		System.out.println("Enter the Product Cmp Name ");
		p.setCmpName(sc.next());
		pRepo.save(p);
	}
	public void saveProducts() {
		ArrayList<Product> pList = new ArrayList<Product>();
		Product p1=new Product(101,"Mobile",12000.4,"Samsung");
		Product p2=new Product(102,"TV",45000.00,"Sony");
		Product p3=new Product(103,"Washing Machine",15000.50,"Wipro");
		Product p4=new Product(104,"Mixer",7000.00,"Sujata");
		//List<Product> asList = Arrays.asList(p1,p2,p3,p4);
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		pList.add(p4);
		pRepo.saveAll(pList);
	}
	public void getProduct() {
		Integer id;
		System.out.println("Enter the id to get Product");
		id=sc.nextInt();
		Optional<Product> product = pRepo.findById(id);
		if(product.isPresent()) {
			Product product2 = product.get();
			System.out.println(product2);
		}
	}
	public void getProducts() {
		List<Integer> ids = Arrays.asList(101,102,104);
		Iterable<Product> products = pRepo.findAllById(ids);
		Iterator<Product> pIterator = products.iterator();
		while(pIterator.hasNext()) {
			System.out.println(pIterator.next());
			
		}
	}
	public void getAllProduct() {
		Iterable<Product> all = pRepo.findAll();
		Iterator<Product> pIterator = all.iterator();
		while(pIterator.hasNext()) {
			System.out.println(pIterator.next());
			
		}		
	}
	public void getIfPresent() {
		System.out.println("Enter id to check and get the product");
		Integer id=sc.nextInt();
		boolean exists = pRepo.existsById(id);
		if(exists) {
			Optional<Product> product=pRepo.findById(id);
			Product product2 = product.get();
			System.out.println(product2);
			
		}
		else 
			System.out.println("Product is not avalible");
		
	}
	public void checkNoOfProduct() {
		long count = pRepo.count();
		System.out.println("No of product avalible : "+count);
		if(count!=0) {
			Iterable<Product> all = pRepo.findAll();
			Iterator<Product> pIterator = all.iterator();
			while(pIterator.hasNext()) {
				System.out.println(pIterator.next());
			}			
		}					
	}
	public void deleteProduct() {
		System.out.println("enter bellow option to perfurm the delelet operation");
		System.out.println("for single product(by id=1 , by prodct=2) for multiple product (ids=3 ,products=4) or all=5");
		int key=sc.nextInt();
		switch (key) {
		case 1: {
			System.out.println("enter id");
			int id=sc.nextInt();
			if(pRepo.existsById(id)) {
				pRepo.deleteById(id);
				System.out.println("product deleted successfully");
			}else
				System.out.println("enter a valid id");
			break;
		}
		case 2:{
			System.out.println("id , P Name , price , Cmp name");
			Product p=new Product();
			p.setPid(sc.nextInt());
			p.setpName(sc.next());
			p.setPrice(sc.nextDouble());
			p.setCmpName(sc.next());
			if(pRepo.existsById(p.getPid())) {
				pRepo.delete(p);
				System.out.println("Product is deleted");
			}else
				System.out.println("enter proper product");
			break;
		}
		case 3:{
			ArrayList<Integer> ids=new ArrayList<>();
			System.out.println("enter no ides");
			int noIds=sc.nextInt();
			System.out.println("Enter ides");
			for(;noIds>0;) {
			ids.add(sc.nextInt());
			noIds--;
			}
			pRepo.deleteAllById(ids);
			System.out.println("All id based record were deleted");
			break;
		}
		case 4:{
			System.out.println("enter no of products want to delete");
			int prds=sc.nextInt();
			System.out.println("enter values for product");
			ArrayList<Product> pList= new ArrayList<>();
			for(;prds>0;) {
				Product p= new Product();
				p.setPid(sc.nextInt());
				p.setpName(sc.next());
				p.setPrice(sc.nextDouble());
				p.setCmpName(sc.next());
				
				pList.add(p);
				prds--;
				
			}
			pRepo.deleteAll(pList);	
			System.out.println("product deleted");
			break;
		}
		case 5:{
			pRepo.deleteAll();
			System.out.println("All product deleted");
			break;
		}
		default:
			System.out.println("pleas enter a valid option");
		}
	}

	

}
