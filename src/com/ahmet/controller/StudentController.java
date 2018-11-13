package com.ahmet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ahmet.springdemo.entity.Student;
import com.ahmet.springdemo.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService ;
	
	// REFACTORY(Kodun Yeniden Duzenlenmesi) Yazilan kodun islevselligini(yaptigi isi) degistirmeden duzenlenmesi islemidir.
	
	// @RequestMapping(path="/list", method=RequestMethod.GET) <=> Request("/list")
	@GetMapping("/list")
	public String listStudent(Model theModel) {
		
		List<Student> theStudent = studentService.getStudents();
		
		theModel.addAttribute("students", theStudent);
		
		return "list-student";
	}
	
	@GetMapping("/showStudentForm")
	public String showStudentForm(Model theModel) {
		
		Student theStudent = new Student();
		theModel.addAttribute("student", theStudent); // student-form'da belirtmiş olduğumuz student attribute'si eklenir
		
		return "student-form";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(@ModelAttribute("student") Student theStudent) {
		
		studentService.saveStudent(theStudent);
		
		return "redirect:/student/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("studentID") int theID, Model theModel) {
		
		Student theStudent = studentService.getStudent(theID);
		theModel.addAttribute(theStudent);
		
		return "student-form";
	}
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("studentID") int theID, Model theModel){
		
		studentService.deleteStudent(theID);
		return "redirect:/student/list";	
	}
	
}






































