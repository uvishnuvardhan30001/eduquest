package com.klef.jfsd.sdp.service;

import com.klef.jfsd.sdp.model.Instructor;

public interface InstructorService 
{
	public String InstructorRegistraion(Instructor i);
	public Instructor checkInstructorLogin(String email,String password);
}
