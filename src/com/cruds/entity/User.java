package com.cruds.entity;

public class User {

	
	private String userid;
	private String password;
	private String role;

	//private String role;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "userid=" + userid ;
	}
	
	
}
