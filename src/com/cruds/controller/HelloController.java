package com.cruds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloController {

	
	/*@RequestMapping("/hello")
	public ModelAndView sayhllo()
	{
		return new ModelAndView("home", "MESSAGE","hello Spring MVC");
	}*/
	
	
	@RequestMapping("/hello")
	public String sayhello(Model model)
	{
		model.addAttribute("MESSAGE", "hello again from string");
		return "home";
	}
	
}
