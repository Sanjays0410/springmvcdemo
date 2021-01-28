package com.cruds.db;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.db.DepartmentDAOImpl.DeptRowMapper;
import com.cruds.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public boolean Create(Department d) {
		
		String sql="insert into department(deptid,deptname) values(?,?)";
		 int rows=jdbcTemplate.update(sql,new Object[]{d.getId(),d.getName()});
		 return rows>0;
	}
	@Override
	public List<Department> getall() {
		
		String sql="select * from Department";
		List< Department> deptlist=jdbcTemplate.query(sql,new DeptRowMapper());
		System.out.println(deptlist);
		return deptlist;
		
	}
	
	class DeptRowMapper implements RowMapper<Department>
	{

		@Override
		public Department mapRow(ResultSet rs, int arg1) throws SQLException {
			// TODO Auto-generated method stub
			
			Department d=new Department();
			d.setId((rs.getInt(1)));
			d.setName((rs.getString(2)));
			return d;
		}
		
	}

	@Override
	public Department get(int deptid) {
		String sql="select * from department where deptid=?";
		Department d=jdbcTemplate.queryForObject(sql, new Object[]{deptid},new DeptRowMapper());
		return d;
	}
	@Override
	public boolean Delete(int id) {
		
		
		String sql="delete from department where deptid=?";
		 jdbcTemplate.update(sql, new Object[]{id});
		return true;
	}

}
