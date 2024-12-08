package com.klef.jfsd.sdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController 
{
	@Autowired
	private StudentService studentService;
	
	@GetMapping("studenthome")
	  public ModelAndView studenthome()
	  {
	    ModelAndView mv=new ModelAndView("studenthome");
	    return mv;
	  }
	@GetMapping("studentreg")
	  public ModelAndView studentreg()
	  {
		ModelAndView mv = new ModelAndView("studentreg");
		return mv;
	  }
	@PostMapping("insertstudent")
	public ModelAndView insertstudent(HttpServletRequest request)
	{
		String name = request.getParameter("sname");
	    String gender = request.getParameter("sgender");
	    String dob = request.getParameter("sdob");
	    String email = request.getParameter("semail");
	    String password = request.getParameter("spwd");
	    String contact = request.getParameter("scontact");
	    String location = request.getParameter("slocation");
	    String regulation = request.getParameter("sregulation");
	    String status = "Registered";
	    
	      Student student = new Student();
	      student.setSname(name);
	      student.setGender(gender);
	      student.setDateofbirth(dob);
	      student.setEmail(email);
	      student.setPassword(password);
	      student.setContact(contact);
	      student.setLocation(location);
	      student.setRegulation(regulation);
	      student.setStatus(status);
	      
	      String msg = studentService.studentRegistraion(student);

	      ModelAndView mv = new ModelAndView("studentlogin");
	      mv.addObject("message", msg);
	    
	      return mv;
	}
	 @GetMapping("studentlogin")
	  public ModelAndView studentlogin() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("studentlogin");
	    return mv;
	  }
	 @PostMapping("checkStudentLogin")
	  //@ResponseBody
	  public ModelAndView checkStudentLogin(HttpServletRequest request) 
	  {
		   ModelAndView mv = new ModelAndView();
		   String semail=request.getParameter("semail"); 
		   String spassword= request.getParameter("spwd"); 
		   Student s= studentService.checkStudentLogin(semail, spassword); 

	    if(s!=null) {
	    	HttpSession session = request.getSession();
			session.setAttribute("student", s);
	      mv.setViewName("studenthome");
	    }
	    else {
	     mv.setViewName("studentlogin");
	      mv.addObject("message","Login Failed!");
	    }
	    return mv;
	  }
	 
	 @GetMapping("updatestudent")
	 public ModelAndView updatestudent(@RequestParam("id")int id)
		{
		ModelAndView mv = new ModelAndView("updatestudent");
		Student student = studentService.getStudentById(id);
		mv.addObject("student",student);
		
		return mv;
		}
	 @PostMapping("update")
	 public ModelAndView update(HttpServletRequest request) {
	     ModelAndView mv = new ModelAndView("updatestudent");
	     
	     int id = Integer.parseInt(request.getParameter("sid"));
	     String name = request.getParameter("sname");
	     String gender = request.getParameter("sgender");
	     String dob = request.getParameter("sdob");
	     String email = request.getParameter("semail");
	     String password = request.getParameter("spwd");
	     String contact = request.getParameter("scontact");
	     String location = request.getParameter("slocation");
	     String regulation = request.getParameter("sregulation");
	     
	     // Fetch the existing student
	     Student student = studentService.getStudentById(id);
	     if (student != null) {
	         // Update student details
	         student.setSname(name);
	         student.setGender(gender);
	         student.setDateofbirth(dob);
	         student.setEmail(email);
	         student.setPassword(password);
	         student.setContact(contact);
	         student.setLocation(location);
	         student.setRegulation(regulation);

	         // Save updated student
	         studentService.updateStudent(student);
	         
	         mv.addObject("message", "Student details updated successfully.");
	     } else {
	         mv.addObject("message", "Student not found.");
	     }

	     return mv;
	 }

	 @GetMapping("studentlogout")
		public ModelAndView studentlogout()
		{
			ModelAndView mv =new ModelAndView();
			mv.setViewName("index");
			return mv;
		}
	 @GetMapping("studentprofile")
	 public ModelAndView studentprofile()
	 {
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("studentprofile");
		 return mv;
	 }
}
