package com.ahmet.springdemo.service;

import java.util.List;

import com.ahmet.springdemo.entity.Student;

public interface StudentService {
	
	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudent(int theID);

	public void deleteStudent(int theID);
	
}
