package in.Ashokit.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import in.Ashokit.Service.Book;



public class BookDaoImpl implements IBookDao {

	private JdbcTemplate jdbctemplate;
	
	public BookDaoImpl(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	Scanner sc=new Scanner(System.in);
	@Override
	public boolean save(String sql) {
	int i=jdbctemplate.update(sql);
		if(i!=0)return true;
		return false;
	}



	@Override
	public List<Book> findAll() {
		
		List<Book> books=jdbctemplate.query("select * from Book", new ResultSetExtractor<List<Book>>() {

			@Override
			public List<Book> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Book> list = new ArrayList<Book>();{
					while(rs.next()) {
						Book book=new Book();
						book.setId(rs.getInt(1));
						book.setName(rs.getString(2));
						book.setPrice(rs.getDouble(3));
						list.add(book);
					}
					
				};
				return list;
			}
		});
		return books;
	}

	@Override
	public int update(int id, double price) {
		String sql="Update Book set book_price="+price+" where book_id="+id;
		jdbctemplate.execute(sql);
		
		return 1;
	}



	@Override
	public List<Book> findById(int id) {
		List<Book> books=jdbctemplate.query("select * from Book where book_id="+id, new ResultSetExtractor<List<Book>>() {

			@Override
			public List<Book> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Book> list = new ArrayList<Book>();{
					while(rs.next()) {
						Book book=new Book();
						book.setId(rs.getInt(1));
						book.setName(rs.getString(2));
						book.setPrice(rs.getDouble(3));
						list.add(book);
					}
					
				};
				return list;
			}
		});
		return books;
	}

}
