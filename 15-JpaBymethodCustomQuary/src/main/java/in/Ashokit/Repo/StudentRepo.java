package in.Ashokit.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Ashokit.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	public  Optional<Student> findBySname(String name);
	public Iterable<Student> findByQualification(String qulification);
	
	
}
