package com.niit.coolcodersbackend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView getIndex()
	{
		ModelAndView mv = new ModelAndView("index1");
		return mv;
	}
	
	@RequestMapping("signin")
	public ModelAndView getSignin()
	{
	ModelAndView mv= new ModelAndView("signin");
	return mv;
	}
	
	@RequestMapping("register")
	public ModelAndView getRegister()
	{
	ModelAndView mv = new ModelAndView("register");
	return mv;
	}


}
