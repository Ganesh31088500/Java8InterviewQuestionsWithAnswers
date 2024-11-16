package com.example.demo.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
private String name;
private int height;
private double salary;
private String gender;
List<String> hobbies=new ArrayList<>();
public Employee(String name, int height, double salary, String gender, List<String> hobbies) {
	super();
	this.name = name;
	this.height = height;
	this.salary = salary;
	this.gender = gender;
	this.hobbies = hobbies;
}
public Employee() {
	super();
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public List<String> getHobbies() {
	return hobbies;
}
public void setHobbies(List<String> hobbies) {
	this.hobbies = hobbies;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", height=" + height + ", salary=" + salary + ", gender=" + gender + ", hobbies="
			+ hobbies + "]";
}

}
