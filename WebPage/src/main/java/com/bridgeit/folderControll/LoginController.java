package com.bridgeit.folderControll;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bridgeit.model.User;

@Controller
public class LoginController {

	private static final ModelAndView ModelAndView = null;

	  @RequestMapping(value = "/login", method = RequestMethod.GET)

	  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {

	    ModelAndView mav = new ModelAndView("index");

	    mav.addObject("user", new User());

	    return mav;

	  }


	
	
	@RequestMapping(value = "/loginprocess", method = RequestMethod.POST)

	public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,

			@ModelAttribute("user") User user) {

		ModelAndView mav = null;
		String username = user.getUsername();
		String password = user.getPassword();

		if (username != "" && password != "") {
			
			mav = new ModelAndView("welcome");

			mav.addObject("Username", user.getUsername());
			

		} else {
			mav = new ModelAndView("index");

			mav.addObject("message", "Username or Password is wrong!!");

		}
		
		return mav;
	}

}
