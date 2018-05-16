package com.example.udemy.backendninja.models;

public class Alumno {
	private String name;
	private int age;
	private int id;
	
	public Alumno(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Alumno(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Alumno [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
	
	
}
