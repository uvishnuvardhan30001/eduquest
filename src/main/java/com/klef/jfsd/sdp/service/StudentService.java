package com.klef.jfsd.sdp.service;



import com.klef.jfsd.sdp.model.Student;

public interface StudentService
{

	public String studentRegistraion(Student s);
	public Student checkStudentLogin(String email,String password);
	public String updateStudent(Student student);
	public Student getStudentById(int id);
}
