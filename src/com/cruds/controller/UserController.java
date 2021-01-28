package com.cruds.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cruds.entity.User;
import com.cruds.service.UserService;

@Controller
@SessionAttributes("USER")

public class UserController {

	@Autowired
	UserService service;


	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String showDeptform(Model model)
	{
		model.addAttribute("command", new User());
		return "login";

	}

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String dodeptform(@ModelAttribute("login")User u,RedirectAttributes ra, Model model,HttpSession session) 
	{

		System.out.println(u);

		//service.Fetch(u);

		//return "success";


		if(service.getuser(u) != null)
		{

			model.addAttribute("USER",u);
			session.setAttribute("USER", u);
			return "success";
		}
		

		else {
			ra.addAttribute("ERROR","Invalid username or password");
			return "redirect:login";
		}

	}
}
