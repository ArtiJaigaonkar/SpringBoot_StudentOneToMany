package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentRepository;
import com.model.Student;

@Service
public class StudentServiceImpl implements StudentService{

	
	@Autowired
	StudentRepository stuRepo;
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return stuRepo.save(student);
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return stuRepo.findAll();
	}

}
