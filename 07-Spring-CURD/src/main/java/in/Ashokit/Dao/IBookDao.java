package in.Ashokit.Dao;

import java.util.List;

import in.Ashokit.Service.Book;

public interface IBookDao {
	public boolean save(String sql);
	public List<Book> findById(int id);
	public List<Book> findAll();
	public int update(int id,double price);
}
