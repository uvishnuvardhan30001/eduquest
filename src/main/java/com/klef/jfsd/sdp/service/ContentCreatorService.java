package com.klef.jfsd.sdp.service;

import java.util.List;

import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;

public interface ContentCreatorService 
{
	public String ContentCreatorRegistraion(ContentCreator cc);
	public ContentCreator checkContentCreatorLogin(String email,String password);
	
	public String addCourse(Course course);
	public List<Course> viewAllCourses();
	public Course displayCourseById(int cid);
}
