package com.cruds.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cruds.entity.Department;
import com.cruds.service.DepartmentService;

@Controller
public class DepartmentController {
	
	@Autowired
	DepartmentService service;

	
	@RequestMapping(value="/department",method=RequestMethod.GET)
	public String showDeptform(Model model)
	{
		model.addAttribute("command", new Department());
		model.addAttribute("DEPT_LIST",service.getall());
		return "dept";
		
	}
	/*@RequestMapping(value="/department",method=RequestMethod.POST)
	public String dodeptform(@RequestParam("deptid") String id, @RequestParam("deptname") String name)
	{
		System.out.println(id+""+name);
		return "success";
	}*/
	@RequestMapping(value="/department",method=RequestMethod.POST)
	public String dodeptform(@ModelAttribute("department")Department d)
	{
		System.out.println(d.getId()+""+d.getName());
		service.Create(d);
		
		return "redirect:department";
	}
	
	
	@RequestMapping(value="/getdept",method=RequestMethod.GET)
	public String getdept(@ModelAttribute("getdept")Department d)
	{
		System.out.println(d.getId()+""+d.getName());
		service.getdept(101);
		return "success";
	}
	
	
	
	@RequestMapping(value="/listdept",method=RequestMethod.GET)
	public String getall(Model model)
	{
		model.addAttribute("DEPT_LIST",service.getall());
		return "deptlist";
	}
	
	@RequestMapping(value="deldept-{id}",method=RequestMethod.GET)
	public String Dodelete(@PathVariable int id)
	{
		service.Delete(id);
		return "redirect:department" ;
		
	}
}
