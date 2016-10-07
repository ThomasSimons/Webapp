package com.realdolmen.bookstore;

import java.io.Serializable;


public class Person implements Serializable {
	private String name="default";
	private String gender;
	

	public String getName() {
		return name;
	}

	public Person(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + "]";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
	
	

}
