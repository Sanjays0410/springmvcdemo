package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentDAO dao;
	
	public boolean Create(Department d)
	{
		return dao.Create(d);
	}
	
	public List<Department> getall()
	{
		return dao.getall();
	}
	public Department getdept(int deptid){
		
		return dao.get(deptid);
	}
	public boolean Delete(int id)
	{
		return dao.Delete(id);
	}
}
