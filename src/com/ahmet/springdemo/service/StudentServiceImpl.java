package com.ahmet.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ahmet.springdemo.dao.StudentDAO;
import com.ahmet.springdemo.entity.Student;

@Service // Bu classin servis classi oldugu sisteme bildirilir
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDAO studentDAO;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		
		return studentDAO.getStudents();
	}

	@Override
	@Transactional
	public void saveStudent(Student theStudent) {
		studentDAO.saveStudent(theStudent);
	}

	@Override
	@Transactional
	public Student getStudent(int theID) {
		
		return studentDAO.getStudents(theID);
	}

	@Override
	@Transactional
	public void deleteStudent(int theID) {
		
		studentDAO.deleteStudent(theID);
	}

}












