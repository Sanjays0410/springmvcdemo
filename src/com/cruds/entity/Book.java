package com.cruds.entity;

public class Book {

	private int isbn;
	private String title;
	private String price;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int isbn, String title, String price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
}
