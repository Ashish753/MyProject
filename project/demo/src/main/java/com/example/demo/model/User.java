package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "users")
public class User {
	
	@Id
	//@GeneratedValue (strategy = GenerationType.AUTO)
	
	@Column (name = "u_ID")
	private String user_id;

	@Column (name = "u_first_name")
	private String first_name;
	
	@Column (name = "u_last_name")
	private String last_name;
	
	@Column (name = "u_email")
	private String email;
	
	@Column (name = "u_password")
	private String password;
	
	@Column (name = "u_mobile_no")
	private String mobileno;

	
	public String getUser_id() {
		return user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	
	
	

}
