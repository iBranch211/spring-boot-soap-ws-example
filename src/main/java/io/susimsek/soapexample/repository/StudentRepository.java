package io.susimsek.soapexample.repository;

import io.susimsek.soapexample.domain.Student;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {
	private static final Map<String, Student> students = new HashMap<>();

	@PostConstruct
	public void initData() {
		
		Student student = new Student();
		student.setName("Sajal");
		student.setStandard(5);
		student.setAddress("Pune");
		students.put(student.getName(), student);
		
		student = new Student();
		student.setName("Kajal");
		student.setStandard(5);
		student.setAddress("Chicago");
		students.put(student.getName(), student);
		
		student = new Student();
		student.setName("Lokesh");
		student.setStandard(6);
		student.setAddress("Delhi");
		students.put(student.getName(), student);
		
		student = new Student();
		student.setName("Sukesh");
		student.setStandard(7);
		student.setAddress("Noida");
		students.put(student.getName(), student);
		
		
	}

	public Student findStudent(String name) {
		Assert.notNull(name, "The Student's name must not be null");
		return students.get(name);
	}
}
