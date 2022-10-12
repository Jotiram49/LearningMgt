package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.controller.CourseController;
import com.example.model.Course;
import com.example.repository.CourseRepository;

//@SpringBootTest
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class })
class ApplicationTests {

	@Autowired
	private CourseController courseController;

	@MockBean
	private CourseRepository repository;

	@Test
	public void testAllCourse() {
		Mockito.when(repository.findAll())
				.thenReturn(Arrays.asList(new Course(), new Course(), new Course()));
		List<Course> airline = courseController.getCourse();
		Assertions.assertSame(3, airline.size());
	}

	@Test
	public void saveCourseTest() {
		Course course = new Course();
		course.setId(100);
		course.setCourseName("Spicejet");
		course.setLaunchUrl("HelloAddress");
		course.setCourseDescription("9933556758");
		course.setCourseDuration("test");
		course.setTechnology("java");
		Mockito.when(courseController.saveCourse(Mockito.any())).thenReturn(course);
		assertEquals(course, courseController.saveCourse(course));
	}
	@Test
    public void testAirlinebyId() {
		Course course = new Course();
		course.setId(1);
		Optional<Course> optional = Optional.of(course);
		Mockito.when(repository.findById(3)).thenReturn(optional);
		Assertions.assertSame(1, course.getId());
    }
	/*
	 * @Test void contextLoads() { }
	 */

}
