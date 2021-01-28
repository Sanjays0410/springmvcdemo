package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public boolean Create(Book b) {
		
		String sql="insert into book(bookid,title,prize) values(?,?,?)";
		 int rows=jdbcTemplate.update(sql,new Object[]{b.getIsbn(),b.getTitle(),b.getPrice()});
		 return rows>0;
		
	}

	@Override
	public List<Book> getall() {
		
		String sql="select * from book";
		List<Book> booklist=jdbcTemplate.query(sql,new BookRow());
		System.out.println(booklist);
		return booklist;
		
		
	}
	 class BookRow implements RowMapper<Book>
	 {

		@Override
		public Book mapRow(ResultSet rs, int arg1) throws SQLException {
			
			Book b= new Book();
			b.setIsbn(rs.getInt(1));
			b.setTitle(rs.getString(2));
			b.setPrice(rs.getString(3));
			return  b;
			
		 
		}
	 }
}
