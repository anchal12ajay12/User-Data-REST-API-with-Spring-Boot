package com.manojJM.userData.controller;

/**
 * User class representing a user with name and age fields.
 */

public class User {

    private Long id;
    private String name;
    private int age;

    // Constructors, getters, and setters

    public User(Long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
