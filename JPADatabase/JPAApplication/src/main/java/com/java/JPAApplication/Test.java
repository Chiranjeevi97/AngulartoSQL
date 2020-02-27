package com.java.JPAApplication;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Test {
	
	@Id
//	@Column(name="user_Id")
	private int user_Id;
//	@Column(name="first_name")
	private String first_name;
//	@Column(name="last_name")
	private String last_name;
	
	public Test() {
		super();
	}
	
	public Test(int user_Id, String first_name, String last_name) {
		super();
		this.user_Id = user_Id;
		this.first_name = first_name;
		this.last_name = last_name;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
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
}
