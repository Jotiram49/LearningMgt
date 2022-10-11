package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.FlightNotFoundException;
import com.example.model.Course;
import com.example.service.CourseService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/API/courseController")
@CrossOrigin
public class CourseController {
	@Autowired
	private CourseService service;

	@GetMapping("")
	@Cacheable(value = "course")
	@ApiOperation(value = "Find all course", notes = "Header is not required", response = List.class)
	public List<Course> getCourse() {
		return service.getallCourse();
	}

	@PostMapping("")
	public Course saveCourse(@RequestBody Course course) {
		return service.addCourse(course);
	}

	@GetMapping("/{id}")
	public Course FindCourseId(@PathVariable int id) throws FlightNotFoundException {
		return service.findCourseById(id);
	}

	@DeleteMapping("/{id}")
	public boolean DeleteCourseId(@PathVariable int id) throws FlightNotFoundException {
		return service.deleteCourse(id);
	}

	@PutMapping("/{id}")
	public Course updateCourse(@RequestBody Course course, @PathVariable int id) throws FlightNotFoundException {
		return service.updateCoursebyId(id, course);
	}

	@GetMapping("test")
	public String saveCourse() {
		return "Hi";
	}

}
