package com.sp.demo.model;

public class User {
	private String name;
	private String email;
	private String type;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public User() {}
	public  String show()
	{
		return String.format("Name=%s\nEmail=%s\nType=%s\n", name,email,type);
	}
	
	 
	

}