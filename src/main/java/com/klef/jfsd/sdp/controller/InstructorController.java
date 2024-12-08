package com.klef.jfsd.sdp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.service.InstructorService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class InstructorController 
{
	@Autowired
	private InstructorService instructorservice;
	
	@GetMapping("instructorhome")
	public ModelAndView Instructorhome()
	  {
	    ModelAndView mv=new ModelAndView("instructorhome");
	    return mv;
	  }
	@GetMapping("instructorreg")
	  public ModelAndView studentreg()
	  {
		ModelAndView mv = new ModelAndView("instructorreg");
		return mv;
	  }
	
	@PostMapping("insertinstructor")
	public ModelAndView insertinstructor(HttpServletRequest request)
	{
		String name = request.getParameter("iname");
	    String gender = request.getParameter("igender");
	    String dob = request.getParameter("idob");
	    String email = request.getParameter("iemail");
	    String password = request.getParameter("ipwd");
	    String contact = request.getParameter("icontact");
	    String graduation = request.getParameter("igraduation");
	    String status = "Registered";
	    
	      Instructor instructor = new Instructor();
	      instructor.setName(name);
	      instructor.setGender(gender);
	      instructor.setDateofbirth(dob);
	      instructor.setEmail(email);
	      instructor.setPassword(password);
	      instructor.setContact(contact);
	      instructor.setGraduation(graduation);
	      instructor.setStatus(status);
	      
	      String msg = instructorservice.InstructorRegistraion(instructor);

	      ModelAndView mv = new ModelAndView("studentlogin");
	      mv.addObject("message", msg);
	    
	      return mv;
	}
	
	 @GetMapping("instructorlogin")
	  public ModelAndView instructorlogin() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("instructorlogin");
	    return mv;
	  }
	 @PostMapping("checkInstructorLogin")
	  //@ResponseBody
	  public ModelAndView checkStudentLogin(HttpServletRequest request) 
	  {
		   ModelAndView mv = new ModelAndView();
		   String iemail=request.getParameter("iemail"); 
		   String ipassword= request.getParameter("ipwd"); 
		   Instructor i = instructorservice.checkInstructorLogin(iemail, ipassword);

	    if(i.getStatus().equals("Approved")) 
	    {
	      mv.setViewName("instructorhome");
	    }
	    else {
	     mv.setViewName("instructorlogin");
	      mv.addObject("message","Login Failed!");
	    }
	    return mv;
	  }
	
}
