package in.Ashokit.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class BookDao implements IBook{
	JdbcTemplate jdbcTemplate;
	
	public BookDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(String sql) {
		int i=jdbcTemplate.update(sql);
		System.out.println("record inserted "+i);
	}
}
