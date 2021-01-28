package com.cruds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruds.db.UseDAO;
import com.cruds.entity.User;

@Service
public class UserService {

	@Autowired
	UseDAO dao;
	
	public User getuser(User u)
	{
		return dao.getuser(u);
	}
}
