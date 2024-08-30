package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.StudentServiceImpl;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	StudentServiceImpl studService;
	
	@PostMapping("/addStudent")
	public Student addStu(@RequestBody Student student) {
		return studService.addStudent(student);
	}
	
	@GetMapping("/getStudents")
	public List<Student>getStudent(){
		return studService.getStudents();
	}
}
