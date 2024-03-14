package com.company.service;

public interface ICompanyService {
	public void saveCompany(int id,String name,String City);
	public void findcompany(int id);
	public void findAll();
	public void delete(int id);
	public void updateCompany(int id,String name,String city);
}
