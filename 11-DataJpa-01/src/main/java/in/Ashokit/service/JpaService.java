package in.Ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Ashokit.entity.Employee;
import in.Ashokit.repositry.MyRepositry;

@Service
public class JpaService {
	@Autowired
	private MyRepositry myRepo;
	public void saveRecord() {
		Employee e=new Employee();
		e.setEmpid(101);
		e.setEmpName("sandeep");
		e.setSalary(4000);
		
		myRepo.save(e);
	}

}
