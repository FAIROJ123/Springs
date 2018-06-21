package com.bridgeit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RegisterInterceptor extends HandlerInterceptorAdapter {

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {


		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String phone = request.getParameter("phone");

		if (username.equals("") || name.equals("") || phone.equals("") ) {
			ModelAndView mav;
				
			mav = new ModelAndView("register");

			mav.addObject("message", "Enter All the fields..");
			throw new ModelAndViewDefiningException(mav);
			

		} 
		if(password.length()<=5 || password.equals(" ")) {
			
			ModelAndView mav;
			mav = new ModelAndView("register");

			mav.addObject("message", "password length is minimum 5 letters.");
			throw new ModelAndViewDefiningException(mav);
		}
		
		if(phone.length()<10)
		{
			ModelAndView mav;
			mav = new ModelAndView("register");

			mav.addObject("message", "Mobile number must be 10 integers.");
			throw new ModelAndViewDefiningException(mav);
		}
		else
		return true;

	}
}
