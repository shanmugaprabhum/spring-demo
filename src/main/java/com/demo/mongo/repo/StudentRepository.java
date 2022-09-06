package com.demo.mongo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.mongo.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

	List<Student> findStudentByMarksSubjectNameIgnoreCaseLike(String subjectName);
	
	
	List<Student> findStudentByMarksSubjectNameIgnoreCaseLikeAndMarksRemarksIgnoreCaseLike(String subjectName, String remake);

}
