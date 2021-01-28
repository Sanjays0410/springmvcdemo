package com.cruds.db;

import java.util.List;

import com.cruds.entity.Book;

public interface BookDAO {

	
	public boolean Create(Book b);
	
	public List<Book> getall();
}
