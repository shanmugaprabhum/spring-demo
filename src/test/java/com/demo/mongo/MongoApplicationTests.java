package com.demo.mongo;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.demo.mongo.model.Mark;
import com.demo.mongo.model.Student;
import com.demo.mongo.repo.StudentRepository;

@DataMongoTest
@ExtendWith(SpringExtension.class)
class MongoApplicationTests {

	@Autowired
	StudentRepository repo;
	
	@BeforeEach
	public void dataLoad() {
		Student student = new Student("Prabhu", "Technology Rockers", List.of(new Mark("Maths", 50, "50 Percent"),
				new Mark("Science", 60, "60 Percent"), new Mark("English", 70, "70 Percent")));
		Student student1 = new Student("Prabhu", "Technology Rockers", List.of(new Mark("Maths", 60, "60 Percent"),
				new Mark("Science", 70, "70 Percent"), new Mark("English", 80, "80 Percent")));
		Student student2 = new Student("Prabhu", "Technology Rockers", List.of(new Mark("Maths", 80, "80 Percent"),
				new Mark("Science", 80, "80 Percent"), new Mark("English", 80, "80 Percent")));
		repo.save(student);
		repo.save(student1);
		repo.save(student2);
	}
	@Test
	public void testRepo() {
		List<Student> students = repo.findStudentByMarksSubjectNameIgnoreCaseLike("Mats");
		students.stream().forEach(s -> System.out.println("Data - "+s.toString()));
		
		List<Student> students1 = repo.findStudentByMarksSubjectNameIgnoreCaseLike("mat");
		students1.stream().forEach(s -> System.out.println("Data - "+s.toString()));
		
		List<Student> students2 = repo.findStudentByMarksSubjectNameIgnoreCaseLikeAndMarksRemarksIgnoreCaseLike("mat", "80 per");
		students2.stream().forEach(s -> System.out.println("Data - "+s.toString()));

	}

}
