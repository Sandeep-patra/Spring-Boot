package in.Ashokit.repositry;

import org.springframework.data.repository.CrudRepository;

import in.Ashokit.entity.Employee;

public interface MyRepositry extends CrudRepository<Employee, Integer>{

}
