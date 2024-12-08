package com.klef.jfsd.sdp.service; 
 
import java.util.List;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
 
public interface AdminService  
{ 
	
 public Admin checkAdminLogin(String username, String password);
 
 public List<Instructor> ViewAllInstructors(); 
 public String updateinststatus(String status,int iid);
 public String deleteinstructor(int iid);
 
 public List<ContentCreator> ViewAllCC(); 
 public String updateccstatus(String status,int ccid);
 public String deletecc(int ccid);
 
 public List<Student>ViewAllStudents(); 
 public String deletestudent(int sid);
}