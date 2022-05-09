package com.yjj.spring_6_2;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private double height;
	private double weight;
	private ArrayList<String> hobbys;
	
	
	public Student(String name, int age, ArrayList<String> hobbys) {
		super();
		this.name = name;
		this.age = age;
		this.hobbys = hobbys;
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


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public ArrayList<String> getHobbys() {
		return hobbys;
	}


	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	
}
