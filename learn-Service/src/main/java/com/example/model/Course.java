package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String coursename;
	private String launchURL;
	private String courseDuration;
	private String courseDescription;
	private String technology;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public String getLaunchURL() {
		return launchURL;
	}

	public void setLaunchURL(String launchURL) {
		this.launchURL = launchURL;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public Course() {
		
	}
	public Course(String coursename, String launchURL, String courseDuration, String courseDescription,
			String technology) {
		super();

		this.coursename = coursename;
		this.launchURL = launchURL;
		this.courseDuration = courseDuration;
		this.courseDescription = courseDescription;
		this.technology = technology;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", coursename=" + coursename + ", launchURL=" + launchURL + ", courseDuration="
				+ courseDuration + ", courseDescription=" + courseDescription + ", technology=" + technology + "]";
	}

}
