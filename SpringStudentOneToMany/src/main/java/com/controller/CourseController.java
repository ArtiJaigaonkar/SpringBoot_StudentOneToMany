package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Course;

import com.service.CourseServiceImpl;

@RestController
@RequestMapping("/Course")
public class CourseController {
	
	@Autowired
	CourseServiceImpl couService;
	
	@PostMapping("/addCourse")
	public Course addCou(@RequestBody Course course) {
		return couService.addCourse(course);
	}
	
	@GetMapping("/getCourses")
	public List<Course>getCourses(){
		return couService.getCourses();
	}
	
	@DeleteMapping("/deleteCourse/{cid}")
	public String deleteCourse(@PathVariable int cid) {
		return couService.deleteCourse(cid);
	}
	
}



