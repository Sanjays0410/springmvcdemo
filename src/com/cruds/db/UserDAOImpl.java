package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.entity.User;

@Repository
public class UserDAOImpl implements UseDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public User getuser(User u) {
		
		String sql="select * from user where username=? and password=?";
		User dbuser = null;
		try
		{
			dbuser =jdbcTemplate.queryForObject(sql, new Object[]{u.getUserid(),u.getPassword()},new Userrow());
		}catch(EmptyResultDataAccessException e)
		{
			System.out.println("No User found");
		}
		
		return dbuser;
		
	}
	
	class Userrow implements RowMapper<User>
	{

		@Override
		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			
			return new User(rs.getString(1), null);
		}

	}

}
