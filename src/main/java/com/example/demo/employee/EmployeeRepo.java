package com.example.demo.employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepo {
public static List<Employee> getAllEmployee(){
	Employee e1=new Employee("Ganesh",180,30000,"Male",Arrays.asList("Podcast","Coding","Social Media"));
	Employee e2=new Employee("Sai",180,0,"FeMale",Arrays.asList("Social Media"));
	Employee e3=new Employee("Ganesh Sai",120,10000,"Male",Arrays.asList("Podcast","Coding","Social Media"));
	Employee e4=new Employee("Angelina",180,30000,"Female",Arrays.asList("MakeUp"));
	return Arrays.asList(e1,e2,e3,e4);
}
public static Employee getEmployee() {
	return new Employee("Ganesh",180,30000,"Male",Arrays.asList("Podcast","Coding","Social Media"));
	
}
}
