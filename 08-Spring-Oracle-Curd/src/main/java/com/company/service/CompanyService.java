package com.company.service;

import java.util.Iterator;
import java.util.List;

import com.company.Company;
import com.company.ICompanyDao;

public class CompanyService implements ICompanyService {
	private ICompanyDao cmpDao;
	
	public CompanyService(ICompanyDao cmpDao) {
		this.cmpDao = cmpDao;
	}

	@Override
	public void saveCompany(int id,String name,String City) {
		String sql="insert into company values('"+id+"','"+name+"','"+City+"')";
		System.out.println(+cmpDao.saveCompany(sql)+" company saved successfully");
	}

	@Override
	public void findcompany(int id) {
		String sql="select * from company where cmpid='"+id+"'";
		List<Company> company = cmpDao.findcompany(sql);
		Iterator<Company> iterator = company.iterator();
		System.out.println("company id\tcompany name\tcity");
		while(iterator.hasNext()) {
			Company c = iterator.next();
			System.out.println(c.getCmpId()+"\t"+c.getCmpName()+"\t"+c.getCity());
		}
		
	}

	@Override
	public void findAll() {
		String sql="select * from company";
		List<Company> company = cmpDao.findAll(sql);
		Iterator<Company> iterator = company.iterator();
		System.out.println("company id\tcompany name\tcity");
		while(iterator.hasNext()) {
			Company c = iterator.next();
			System.out.println(c.getCmpId()+"\t"+c.getCmpName()+"\t"+c.getCity());
		}
		
	}

	@Override
	public void delete(int id) {
		String sql="delete from company where cmpid='"+id+"'";
		System.out.println(cmpDao.delete(sql)+" row deleted with "+id+" id");
		
	}

	@Override
	public void updateCompany(int id, String name, String city) {
		String sql="update company set cname='"+name+"',city='"+city+"'where cmpid='"+id+"'";
		System.out.println(cmpDao.updateCompany(sql)+" company updated with "+id+" id");
	}

	

}
