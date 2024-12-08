package com.klef.jfsd.sdp.controller;

import java.io.IOException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.sdp.model.ContentCreator;
import com.klef.jfsd.sdp.model.Course;
import com.klef.jfsd.sdp.model.Instructor;
import com.klef.jfsd.sdp.service.ContentCreatorService;
import com.klef.jfsd.sdp.service.InstructorService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ContentCreatorController 
{
	@Autowired
	private ContentCreatorService contentCreatorService;
	
	@GetMapping("contentcreatorhome")
	public ModelAndView contentcreatorhome()
	  {
	    ModelAndView mv=new ModelAndView("contentcreatorhome");
	    return mv;
	  }
	@GetMapping("contentcreatorreg")
	  public ModelAndView contentcreatorreg()
	  {
		ModelAndView mv = new ModelAndView("contentcreatorreg");
		return mv;
	  }
	
	@PostMapping("insertcontentcreator")
	public ModelAndView insertinstructor(HttpServletRequest request)
	{
		String name = request.getParameter("ccname");
	    String gender = request.getParameter("ccgender");
	    String dob = request.getParameter("ccdob");
	    String email = request.getParameter("ccemail");
	    String password = request.getParameter("ccpwd");
	    String contact = request.getParameter("cccontact");
	    String graduation = request.getParameter("ccgraduation");
	    String dept = request.getParameter("ccdept");
	    String status = "Registered";
	    
	      ContentCreator content = new ContentCreator();
	      content.setName(name);
	      content.setGender(gender);
	      content.setDateofbirth(dob);
	      content.setEmail(email);
	      content.setDept(dept);
	      content.setPassword(password);
	      content.setContact(contact);
	      content.setGraduation(graduation);
	      content.setStatus(status);
	      
	      String msg = contentCreatorService.ContentCreatorRegistraion(content);

	      ModelAndView mv = new ModelAndView("contentcreatorlogin");
	      mv.addObject("message", msg);
	    
	      return mv;
	}
	
	 @GetMapping("contentcreatorlogin")
	  public ModelAndView contentcreatorlogin() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("contentcreatorlogin");
	    return mv;
	  }
	 @PostMapping("checkContentCreatorLogin")
	  //@ResponseBody
	  public ModelAndView checkContentCreatorLogin(HttpServletRequest request) 
	  {
		   ModelAndView mv = new ModelAndView();
		   String ccemail=request.getParameter("ccemail"); 
		   String ccpassword= request.getParameter("ccpwd"); 
		   ContentCreator cc = contentCreatorService.checkContentCreatorLogin(ccemail, ccpassword);

	    if(cc.getStatus().equals("Approved")) 
	    {
	      mv.setViewName("contentcreatorhome");
	    }
	    else {
	     mv.setViewName("contentcreatorlogin");
	    
	      mv.addObject("message","Login Failed!");
	    }
	    return mv;
	  }
	 @GetMapping("cccourse")
	  public ModelAndView cccourse() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("cccourse");
	    List<Course> course = contentCreatorService.viewAllCourses();
	    mv.addObject("course",course);
	    return mv;
	  }
	 @GetMapping("cccreatecourse")
	  public ModelAndView cccreatecourse() {
	    ModelAndView mv=new ModelAndView();
	    mv.setViewName("cccreatecourse");
	    return mv;
	  }
	 @PostMapping("insertcourse")
	 public ModelAndView insertcourse(HttpServletRequest request,@RequestParam("cimage") MultipartFile file) throws IOException,SQLException
	 {
		 String name = request.getParameter("cname");
		 String description = request.getParameter("cdescription");
		 byte[] bytes = file.getBytes();
		 
		 Blob blob = new javax.sql.rowset.serial.SerialBlob(bytes);
		 
		 Course c = new Course();
		 c.setName(name);
		 c.setDescription(description);
		 c.setImage(blob);
		 String message = contentCreatorService.addCourse(c);
		 
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("contentcreatorhome");
		 mv.addObject("message",message);
		 return mv;
	 }
	 
	 @GetMapping("displayproductimage")
		public ResponseEntity<byte[]> displayproductimage(@RequestParam("id")int id) throws SQLException
		{
			Course course = contentCreatorService.displayCourseById(id);
			
			byte[] imagebytes = null;
			
			imagebytes = course.getImage().getBytes(1,(int)course.getImage().length());
			
			return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(imagebytes);
		}
	 
	
}
