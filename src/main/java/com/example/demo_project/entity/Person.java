package com.example.demo_project.entity;

public class Person {
	private String id;				//id = xxx; -> xxx=設定預設值
	private String name;
	private String city;
	private int age;
	
	public Person() {					//空白建構方法
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
