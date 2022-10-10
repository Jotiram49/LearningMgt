package com.example.model;


public class user {
	private int id;
	private String name;
	private String email;
	private String password;
	private int roleId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public user(String name, String email, String password, int roleId) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.roleId = roleId;
	}

	public user() {

	}

	@Override
	public String toString() {
		return "userModel [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", roleId="
				+ roleId + "]";
	}
	

}
