package com.cruds.db;

import java.util.List;

import com.cruds.entity.Department;

public interface DepartmentDAO {

	public boolean Create(Department d);
	
	public List<Department> getall();
	
	public Department get(int id);
	
	public boolean Delete(int id);
	
}
