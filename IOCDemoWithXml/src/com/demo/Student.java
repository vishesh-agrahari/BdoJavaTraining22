package com.demo;

public class Student {
    
	private long id;
	private String name;
	private String course;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public void show() {
		System.out.println("name: "+name+'\n'+"course: "+course);
	}
}
