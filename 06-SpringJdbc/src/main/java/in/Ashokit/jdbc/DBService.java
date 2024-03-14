package in.Ashokit.jdbc;

public class DBService {
	IBook book;
	int id;
	String name;
	double price; 
	
	public DBService(IBook book, int id, String name, double price) {
		this.book = book;
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void add() {
		String sql="insert into Book values("+id+",'"+name+"',"+price+")";
	book.save(sql);
	}
}
