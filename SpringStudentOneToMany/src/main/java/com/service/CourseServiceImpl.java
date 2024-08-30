package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CourseRepository;
import com.model.Course;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository courseRepo;
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepo.save(course);
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	@Override
	public String deleteCourse(int cid) {
		// TODO Auto-generated method stub
		courseRepo.deleteById(cid);
		return cid+"record Deleted";
	}

}
