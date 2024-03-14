package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CompanyDaoImpl implements ICompanyDao {
 private JdbcTemplate template;
 
	public CompanyDaoImpl(JdbcTemplate template) {
	
	this.template = template;
}
	@Override
	public int saveCompany(String sql) {
		
		return template.update(sql);
	}
	@Override
	public List<Company> findcompany(String sql) {
		List<Company> companyes = template.query(sql, new ResultSetExtractor<List<Company>>() {

			@Override
			public List<Company> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Company> list=new ArrayList<Company>();{
					
					while(rs.next()) {
						Company cmp=new Company();
						cmp.setCmpId(rs.getString(1));
						cmp.setCmpName(rs.getString(2));
						cmp.setCity(rs.getString(3));
						list.add(cmp);
					}
				}
				return list;
			}
		});
		
		return companyes;
	}

	@Override
	public List<Company> findAll(String sql) {
		List<Company> companyes = template.query(sql, new ResultSetExtractor<List<Company>>() {

			@Override
			public List<Company> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Company> list=new ArrayList<Company>();{
					
					while(rs.next()) {
						Company cmp=new Company();
						cmp.setCmpId(rs.getString(1));
						cmp.setCmpName(rs.getString(2));
						cmp.setCity(rs.getString(3));
						list.add(cmp);
					}
				}
				return list;
			}
		});
		
		return companyes;
	}

	@Override
	public int delete(String sql) {
		// TODO Auto-generated method stub
		return template.update(sql);
	}

	@Override
	public int updateCompany(String sql) {
		// TODO Auto-generated method stub
		return template.update(sql);
	}



}
