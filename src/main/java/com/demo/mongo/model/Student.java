package com.demo.mongo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Student {

	
	public Student(String name, String className, List<Mark> marks) {
		super();
		this.name = name;
		this.className = className;
		this.marks = marks;
	}

	@Id
	private String id;

	private String name;

	private String className;

	private List<Mark> marks;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Mark> getMarks() {
		return marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", className=" + className + ", marks=" + marks + "]";
	}

}
