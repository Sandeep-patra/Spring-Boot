package in.Ashokit.Service;

import java.util.List;
import java.util.Scanner;

import in.Ashokit.Dao.IBookDao;

public class IBookServiceImpl implements IBookService {
private IBookDao b;


public IBookServiceImpl(IBookDao b) {
	this.b = b;
}

public void setSc(Scanner sc) {
	this.sc = sc;
}

Scanner sc=new Scanner(System.in);
	@Override
	public void save() {
		boolean save = b.save("Insert into Book values(110,'Organic chemistry',1500)");
		if(save)
			System.out.println("Book inserted successfully");
	}

	@Override
	public void findById() {
		
		System.out.println("enter the book id to find");
		List<Book> byId = b.findById(sc.nextInt());
		System.out.println("Book Id \t  Book Name \t Book Pricre");
		System.err.println("--------------------------------------------");
		for(Book b:byId) {
			System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
		}
		
		
	}

	@Override
	public void findAll() {
		List<Book> all = b.findAll();
		System.out.println("Book Id \t  Book Name \t Book Pricre");
		System.err.println("--------------------------------------------");
		for(Book b:all) {
			System.out.println(b.getId()+"\t"+b.getName()+"\t"+b.getPrice());
		}
		
	}

	@Override
	public void update() {
		System.out.println("enter id and price of the book to up date");
		int update = b.update(sc.nextInt(), sc.nextDouble());
		if(update!=0)
		System.out.println("Record updated successfully");
	}



}
