package com.demo.Beans;

public class Project {
	private String name;
	private int duration;
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String name, int duration) {
		super();
		this.name = name;
		this.duration = duration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", duration=" + duration + "]";
	}
	
	
}
