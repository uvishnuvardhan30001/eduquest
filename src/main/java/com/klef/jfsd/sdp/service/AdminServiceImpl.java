package com.klef.jfsd.sdp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.repository.AdminRepository;
import com.klef.jfsd.sdp.repository.ContentCreatorRepository;
import com.klef.jfsd.sdp.repository.InstructorRepository;
import com.klef.jfsd.sdp.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService
{

	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private InstructorRepository instructorRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ContentCreatorRepository contentCreatorRepository;
	
	@Override
	public Admin checkAdminLogin(String username, String password) {
		   return adminRepository.checkAdminLogin(username, password);
		}
	@Override
	  public List<Instructor> ViewAllInstructors() 
	  {
	    return instructorRepository.findAll();
	  }

	  @Override
	  public String updateinststatus(String status, int iid) {
	    instructorRepository.updateinststatus(status, iid);
	    return "Instructor Status Updated Successfully";
	  }
	  
	  @Override
	  public List<Student> ViewAllStudents() 
	  {
	    return studentRepository.findAll();
	  }
	@Override
	public List<ContentCreator> ViewAllCC() {
		return contentCreatorRepository.findAll();
	}
	@Override
	public String updateccstatus(String status, int ccid) {
		contentCreatorRepository.updateccstatus(status, ccid);
		return "CC Status Updated Sucessfully";
	}
	@Override
	public String deleteinstructor(int iid) {
		instructorRepository.deleteById(iid);
		 return"Instructor deleted sucessfully";
	}
	@Override
	public String deletecc(int ccid) {
		contentCreatorRepository.deleteById(ccid);
		 return"ContentCreator deleted sucessfully";
	}
	@Override
	public String deletestudent(int sid) {
		studentRepository.deleteById(sid);
		 return"Student deleted sucessfully";
	}
}
