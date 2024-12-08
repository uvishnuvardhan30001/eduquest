package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.repository.ContentCreatorRepository;
import com.klef.jfsd.sdp.repository.CourseRepository;

@Service
public class ContentCreatorImpl implements ContentCreatorService
{
	@Autowired
	private ContentCreatorRepository contentCreatorRepository;

	@Autowired
	private CourseRepository courseRepository;

	
	@Override
	public String ContentCreatorRegistraion(ContentCreator cc) {
		contentCreatorRepository.save(cc);
		return "ContentCreator Registered Succesfully" ;
	}

	@Override
	public ContentCreator checkContentCreatorLogin(String email, String password) {
		return  contentCreatorRepository.checkContentCreatorLogin(email, password);
	}

	@Override
	public String addCourse(Course course) {
		courseRepository.save(course);
		return "Course Added Sucessfully";
	}

	@Override
	public List<Course> viewAllCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Course displayCourseById(int cid) {
		return courseRepository.findById(cid).get();
	}
	
}
