package com.company;

import java.util.List;

public interface ICompanyDao {
	public int saveCompany(String sql);
	public List<Company> findcompany(String sql);
	public List<Company> findAll(String sql);
	public int delete(String sql);
	public int updateCompany(String sql);
 
}
