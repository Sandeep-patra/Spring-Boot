package in.Ashokit.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import in.Ashokit.Repo.StudentRepo;
import in.Ashokit.entity.Student;

@Service
public class StudentService {
	private StudentRepo sRepo;
	Scanner sc = new Scanner(System.in);

	public StudentService(StudentRepo sRepo) {
		this.sRepo = sRepo;
	}

	public void saveStudents() {
		System.out.println("Enter no of Student want to saved");
		int noS = sc.nextInt();
		ArrayList<Student> sList = new ArrayList<>();
		for (; noS > 0;) {
			System.out.println("Enter the details \n id,name,qualification,gender for Student " + noS);

			Student s = new Student();
			s.setSid(sc.nextInt());
			s.setsName(sc.next());
			s.setQualification(sc.next());
			s.setG(sc.next().charAt(0));
			sList.add(s);
			noS--;
		}
		sRepo.saveAll(sList);
	}

	public void getBySname() {
		System.out.println("Enter the Student name to get");
		String sname = sc.nextLine();
		Optional<Student> student = sRepo.findBySname(sname);
		if (student.isPresent()) {
			Student s = student.get();
			System.out.println(s);
		}
	}

	public void getByQulification() {
		System.out.println("Enter Qualification");
		String qalification = sc.nextLine();
		Iterable<Student> students = sRepo.findByQualification(qalification);
		Iterator<Student> sIterator = students.iterator();
		if (sIterator.hasNext()) {
			while (sIterator.hasNext()) {
				System.out.println(sIterator.next());
			}
		} else
			System.out.println("There is no record present with this Qualification");

	}

}
