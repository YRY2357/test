package com.test.bean;

public class BeanStudent {
	private int id;
	private String name;
	private String gender;
	private int age;
	private String phone;
	
	public BeanStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BeanStudent(int id, String name, String gender, int age, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
	}

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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
