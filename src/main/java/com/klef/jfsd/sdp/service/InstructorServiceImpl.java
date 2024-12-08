package com.klef.jfsd.sdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.repository.InstructorRepository;

@Service
public class InstructorServiceImpl implements InstructorService
{
	@Autowired
	private InstructorRepository instructorrepository;
	
	@Override
	public String InstructorRegistraion(Instructor i) 
	{
		instructorrepository.save(i);
		return "Instructor Registered Succesfully" ;

	}
	
	@Override
	public Instructor checkInstructorLogin(String email, String password) 
	{
		return  instructorrepository.checkInstructorLogin(email, password);

	}
}
