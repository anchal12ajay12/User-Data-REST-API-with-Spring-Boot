package com.manojJM.userData.controller;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Person {
	 @NotNull // Ensure name is not null
	 @Size(min = 3, message = "Name should have at least 2 characters") // Ensure name has at least 2 characters
	 private String name;
	 //	 Task 7: Validate the name and age parameters
	 
	@NotNull(message = "Age cannot be null")
    private int age;
    
    // Getters and Setters for name and age
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
	
    
}

