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
	private String courseName;
	private String launchUrl;
	private String courseDuration;
	private String courseDescription;
	private String technology;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getLaunchUrl() {
		return launchUrl;
	}

	public void setLaunchUrl(String launchUrl) {
		this.launchUrl = launchUrl;
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

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Course() {

	}

	public Course(String courseName, String launchUrl, String courseDuration, String courseDescription,
			String technology) {
		super();
		this.courseName = courseName;
		this.launchUrl = launchUrl;
		this.courseDuration = courseDuration;
		this.courseDescription = courseDescription;
		this.technology = technology;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", launchUrl=" + launchUrl + ", courseDuration="
				+ courseDuration + ", courseDescription=" + courseDescription + ", technology=" + technology + "]";
	}

}