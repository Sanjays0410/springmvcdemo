package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.BookDAO;
import com.cruds.entity.Book;

@Service
public class BookService {

	@Autowired
	BookDAO dao;
	
	public boolean Create(Book b)
	{
		return dao.Create(b);
		
	}
	
	
	public List<Book> getall() {
		return dao.getall();
		
		
	}
}
