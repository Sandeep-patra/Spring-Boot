package in.Ashokit.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Ashokit.Repositry.StudentRepo;
import in.Ashokit.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepo srepo;
	
	public void customQuery() {
//	List<Student> students = srepo.getStudents();
//	Iterator<Student> iterator = students.iterator();
//	while (iterator.hasNext()) {
//		System.out.println(iterator.next());
//		
//	}
	List<Student> maleStudent = srepo.getMaleStudent('m');
	Iterator<Student> itr = maleStudent.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
//	List<Student> s = srepo.getStudentByGender('m');
//	Iterator<Student> Siterator = s.iterator();
//	while (Siterator.hasNext()) {
//		System.out.println(Siterator.next());
//		
//	}
	}
	
}
