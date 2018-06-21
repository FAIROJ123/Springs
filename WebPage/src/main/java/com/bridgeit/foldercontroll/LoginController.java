package com.bridgeit.foldercontroll;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.dao.UserDAO;
import com.bridgeit.model.User;


@Controller
public class LoginController {

	

	@Autowired
	UserDAO userDao;
	
	@RequestMapping(value="/")
	public ModelAndView getHome() {
		return new ModelAndView("index");
	}
	
	  @RequestMapping(value = "/login", method = RequestMethod.GET)

	  public ModelAndView showLogin() {

	    ModelAndView mav = new ModelAndView("index");

	    mav.addObject("user", new User());

	    return mav;

	  }


	
	
	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)

	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("user") User user) {

		ModelAndView mav = null;
		String username = user.getUsername();//username
		String password = user.getPassword();//password
	
		HttpSession session=request.getSession();
		
		
		
		if (username!="" && password!="") 
		{
			User u = userDao.getUser(user);
			session.setAttribute("user", u);
			
			System.out.println(u);
			
			if(u!=null) {
			mav = new ModelAndView("redirect:/welcome");
			mav.addObject("User", u);
			
			}
			else {
				mav = new ModelAndView("index");
				mav.addObject("message", "Data Not Found.. !!");
			}
         
		}
		else {
			mav = new ModelAndView("index");
			mav.addObject("message", "Username or Password is wrong!!");
		}
		
		return mav;
	}

	 @RequestMapping(value = "/welcome", method = RequestMethod.GET)
		public ModelAndView displayWelcome(HttpServletRequest request, HttpServletResponse response) {
		  ModelAndView modelAndView=null;	
		  HttpSession session=request.getSession(false);
		
		  if(session!=null && session.getAttribute("user")!=null)
		  {
			System.out.println("rakesh");  
			modelAndView=new ModelAndView("welcome");
			modelAndView.addObject("user", session.getAttribute("user"));
			
		  }
		  else
		  {
		   System.out.println("soni");	  
		   modelAndView=new ModelAndView("index"); 
		   modelAndView.addObject("message","Please Login First");
		  }
	       
		  return modelAndView;
	}
    }
