package com.klef.jfsd.sdp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository studentrepository;
	
	@Override
	public String studentRegistraion(Student s) 
	{
		studentrepository.save(s);
		return "Student Registered Succesfully" ;

	}

	@Override
	public Student checkStudentLogin(String email, String password) 
	{
		return  studentrepository.checkStudentLogin(email, password);

	}

	@Override
	public String updateStudent(Student student) {
		Student s = studentrepository.findById(student.getId()).get();
		
		s.setContact(student.getContact());
		s.setDateofbirth(student.getDateofbirth());
		s.setGender(student.getGender());
		s.setLocation(student.getLocation());
		s.setSname(student.getSname());
		s.setPassword(student.getPassword());
		
		studentrepository.save(s);
		return "Student Updated SUcessfully";
	}

	@Override
	public Student getStudentById(int id) {
		return studentrepository.findById(id).orElse(null);
	}

}
