package com.klef.jfsd.sdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.Admin;
import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.model.Student;
import com.klef.jfsd.sdp.service.AdminService;

import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class AdminController 
{
	@Autowired
	  private AdminService adminService;
	  @Autowired 
	   private JavaMailSender mailSender;
	
	@GetMapping("/")
	  public ModelAndView home()
	  {
	    ModelAndView mv=new ModelAndView("index");
	    return mv;
	  }
	@GetMapping("contactus")
	  public ModelAndView contactus()
	  {
	    ModelAndView mv=new ModelAndView("contactus");
	    return mv;
	  }
	@GetMapping("proxy")
	  public ModelAndView proxy()
	  {
	    ModelAndView mv=new ModelAndView("proxy");
	    return mv;
	  }
	@GetMapping("adminhome")
	  public ModelAndView adminhome()
	  {
	    ModelAndView mv=new ModelAndView("adminhome");
	    return mv;
	  }
	@GetMapping("about")
	  public ModelAndView about()
	  {
	    ModelAndView mv=new ModelAndView("about");
	    return mv;
	  }
	  @GetMapping("adminlogin")
	  public ModelAndView adminlogin() 
	  {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("adminlogin");
	    return mv;
	  }
	  
	  @PostMapping("checkAdminLogin")
	  //@ResponseBody
	  public ModelAndView checkAdminLogin(HttpServletRequest request) 
	  {
		   ModelAndView mv = new ModelAndView();
		   String auname=request.getParameter("auname"); 
		   String apassword= request.getParameter("apwd"); 
		   Admin admin= adminService.checkAdminLogin(auname, apassword); 

	    if(admin!=null) {
	    	HttpSession session = request.getSession();
	        session.setAttribute("admin",admin);
	      mv.setViewName("adminhome");
	    }
	    else {
	      //return "admin login fail";
	      mv.setViewName("adminlogin");
	      mv.addObject("message","Login Failed!");
	    }
	    return mv;
	  }
	  
	  @GetMapping("viewallinst") 
	  public ModelAndView viewallinst()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<Instructor> instructorlist = adminService.ViewAllInstructors(); 
	    mv.setViewName("viewallinst"); 
	    mv.addObject("instructorlist",instructorlist); 
	    return mv; 
	  } 
	  @GetMapping("instructorstatus") 
	  public ModelAndView instructorstatus()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<Instructor> instructorlist = adminService.ViewAllInstructors(); 
	    mv.setViewName("instructorstatus"); 
	    mv.addObject("instructorlist",instructorlist); 
	    return mv; 
	  } 
	  
	  @GetMapping("viewallstd") 
	  public ModelAndView viewallstd()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<Student> studentlist = adminService.ViewAllStudents(); 
	    mv.setViewName("viewallstd"); 
	    mv.addObject("studentlist",studentlist); 
	    return mv; 
	  }
	  @GetMapping("updateinststatus")
	  public String updateinststatus(@RequestParam("id") int iid,@RequestParam("status") String status)
	  {
	   adminService.updateinststatus(status, iid);
	   return "redirect:/instructorstatus";
	    
	  }
	  
	  @GetMapping("viewallcc") 
	  public ModelAndView viewallcc()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<ContentCreator> cclist = adminService.ViewAllCC(); 
	    mv.setViewName("viewallcc"); 
	    mv.addObject("cclist",cclist); 
	    return mv; 
	  } 
	  @GetMapping("ccstatus") 
	  public ModelAndView ccstatus()
	  { 
	    ModelAndView mv = new ModelAndView(); 
	    List<ContentCreator> cclist = adminService.ViewAllCC(); 
	    mv.setViewName("ccstatus"); 
	    mv.addObject("cclist",cclist); 
	    return mv; 
	  } 
	  @GetMapping("updateccstatus")
	  public String updateccstatus(@RequestParam("id") int ccid,@RequestParam("status") String status)
	  {
	   adminService.updateccstatus(status, ccid);
	   return "redirect:/ccstatus";
	    
	  }
	  @GetMapping("deleteinst")
		public String delete(@RequestParam int id)
		{
			adminService.deleteinstructor(id);
			return "redirect:/viewallinst";
		}
	  @GetMapping("deletecc")
		public String deletecc(@RequestParam int id)
		{
			adminService.deletecc(id);
			return "redirect:/viewallcc";
		}
	  @GetMapping("deletestd")
		public String deletestudent(@RequestParam int id)
		{
			adminService.deletestudent(id);
			return "redirect:/viewallstd";
		}
	  @GetMapping("adminlogout")
	  public ModelAndView adminlogout(HttpServletRequest request)
	  {
	     HttpSession session = request.getSession();
	     session.removeAttribute("admin"); 
	     
	  //   session.invalidate(); //remove all session attributes
	     
	     ModelAndView mv=new ModelAndView();
	     mv.setViewName("index");
	     return mv;
	  }
	  
	 
	 
	  @PostMapping("sendemail")
	   public ModelAndView sendemail(HttpServletRequest request) throws Exception 
	   {
	   String name = request.getParameter("name");
	   String toemail = request.getParameter("email");
	   String subject = request.getParameter("subject");
	   String msg = request.getParameter("message");
	   MimeMessage mimeMessage = mailSender.createMimeMessage();
	   MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
	   
	   helper.setTo(toemail);
	   helper.setSubject(subject);
	   helper.setFrom("eduquesty22@gmail.com");
	   String htmlContent = 
	   "<h3>Contact Form Details</h3>" +
	   "<p><strong>Name:</strong> " + name + "</p>" +
	   "<p><strong>Email:</strong> " + toemail + "</p>" +
	   "<p><strong>Subject:</strong> " + subject + "</p>" +
	   "<p><strong>Message:</strong> " + msg + "</p>";
	   helper.setText(htmlContent, true);
	   mailSender.send(mimeMessage);
	   
	   ModelAndView mv = new ModelAndView("studenthome");
	   mv.addObject("message", "Email Sent Successfully");
	   return mv;
	   }
}

