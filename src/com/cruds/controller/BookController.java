package com.cruds.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.Book;

import com.cruds.service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	

	@RequestMapping(value="/book",method=RequestMethod.GET)
	public String showDeptform(Model model)
	{
		model.addAttribute("command", new Book());
		return "book";
	
}
	
	@RequestMapping(value="/book",method=RequestMethod.POST)
	public String dodeptform(@ModelAttribute("book")Book b) 
	{
		//System.out.println(d.getId()+""+d.getName());
		service.Create(b);
		return "success";
	}
	
	
	@RequestMapping(value="/listbook",method=RequestMethod.GET)
	public String getallbook(Model model)
	{
		//System.out.println(d.getId()+""+d.getName());
		model.addAttribute("BOOK_LIST",service.getall());
		return "booklist";
	}
	
	
}
