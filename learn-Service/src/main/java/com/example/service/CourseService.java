package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.FlightNotFoundException;
import com.example.model.Course;
import com.example.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository repository;

	public Course addCourse(Course course) {
		return repository.save(course);
	}

	public List<Course> getallCourse() {
		return repository.findAll();
	}

	public Course findCourseById(int id) throws FlightNotFoundException{
		System.out.println("in service id: " + id);
		Optional<Course> optional = repository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			throw new FlightNotFoundException("Airline with id: " +id+" is not found in db");
			//return null;
		}
	}
	public boolean deleteCourse(int id) throws FlightNotFoundException {
		if (repository.existsById(id)) {
			this.repository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	public Course updateCoursebyId(int id,Course course) throws FlightNotFoundException
	{
		return repository.findById(id)
	            .map(existcourse -> {
	            	existcourse.setCoursename(course.getCoursename());
	            	existcourse.setLaunchURL(course.getLaunchURL());
	            	existcourse.setCourseDescription(course.getCourseDescription());
	            	existcourse.setCourseDuration(course.getCourseDuration());
	            	existcourse.setTechnology(course.getTechnology());
	                return repository.save(existcourse);
	            })
	            .orElseGet(() -> {
	                return null;
	            });
	}
	
	
}
