package in.Ashokit.Repositry;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.Ashokit.entity.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

	@Query("from Student")
	public List<Student> getStudents();
	
	@Query("from Student where G=:m")
	public List<Student> getMaleStudent(char m);
	
	@Query(value ="select * from Student where G=:g" , nativeQuery = true)
	public List<Student> getStudentByGender(char g);
	
	
}
