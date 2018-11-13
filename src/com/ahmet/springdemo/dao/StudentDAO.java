package com.ahmet.springdemo.dao;

import java.util.List;

import com.ahmet.springdemo.entity.Student;

public interface StudentDAO {
	
	public List<Student> getStudents();

	public void saveStudent(Student theStudent);

	public Student getStudents(int theID);

	public void deleteStudent(int theID);
	
	
}
