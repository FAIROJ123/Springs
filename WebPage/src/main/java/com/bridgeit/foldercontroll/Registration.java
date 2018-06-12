package com.bridgeit.foldercontroll;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.dao.UserDAO;
import com.bridgeit.model.User;

@Controller
public class Registration {
	
	@Autowired
	public UserDAO userDao;

	
	@Autowired
	public void setUserDao(UserDAO userDao)
	{
		this.userDao = userDao;
	}
	 
	  @RequestMapping(value = "/register")
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {

	    ModelAndView mav = new ModelAndView("register");

	    mav.addObject("user", new User());
	    return mav;
	  }
	  
	  

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("user") User user) {

		ModelAndView mav = null;
		
		String name = user.getName();
		String password = user.getPassword();
		String username = user.getUsername();
		String phone = user.getPhone();
		
		userDao.insertUserData(user);
		
		mav = new ModelAndView("index");
        
		mav.addObject("message", "Registration is Done..");
		
        
		
		
		return mav;

	}
}
