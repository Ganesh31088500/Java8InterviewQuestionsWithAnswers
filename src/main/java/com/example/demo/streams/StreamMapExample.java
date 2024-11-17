package com.example.demo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.employee.Employee;
import com.example.demo.employee.EmployeeRepo;

public class StreamMapExample {
	//trasforming names into uppercase 
	static List<String> toUpperTransfor(List<Employee> listOfEmployees){
		return listOfEmployees.stream()
				.map(Employee::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());
	}
public static void main(String[] args) {
	List<String> fruits=Arrays.asList("Banana","Apple","Orange","JackFruit");
	List<Integer> fruitsLength=fruits.stream()
	.map(String::length)
	.collect(Collectors.toList());
	System.out.println(fruitsLength);//[6, 5, 6, 9]
	
	System.out.println("To UpperCase result: "+toUpperTransfor(EmployeeRepo.getAllEmployee()));
}
}
