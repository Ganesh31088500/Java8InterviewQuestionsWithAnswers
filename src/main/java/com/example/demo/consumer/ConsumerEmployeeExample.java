package com.example.demo.consumer;

import java.util.List;
import java.util.function.Consumer;

import com.example.demo.employee.Employee;
import com.example.demo.employee.EmployeeRepo;

public class ConsumerEmployeeExample {
	static Consumer<Employee> e1=(p) -> System.out.println(p);
	static Consumer<Employee> e2=(p) -> System.out.println(p.getName().toUpperCase());
	static Consumer<Employee> e3=(p) -> System.out.println(p.getHobbies());
	static List<Employee> employeeList=EmployeeRepo.getAllEmployee();
	static void printNameAndHobbies() {
		
		System.out.println("In The Print");
		employeeList.forEach(e1.andThen(e2));
		
	}
	static void printWithCondition() {
		employeeList.forEach(e -> { //iterate Employee
			if(e.getGender().equals("Male") && e.getHeight()>=140) {
				e2.andThen(e3).accept(e);
			}
		});
		
	}
	
	static void printWithCond1() {
		employeeList.forEach(e -> {
			if(e.getSalary()>20000) {
				e1.accept(e);
			}
		});
	}
public static void main(String[] args) {
	//List<Employee> employeeList=EmployeeRepo.getAllEmployee();
	e1.accept(EmployeeRepo.getEmployee());
	e2.accept(EmployeeRepo.getEmployee());
	e3.accept(EmployeeRepo.getEmployee());
	//below line, we can write in simple
	e1.andThen(e2).andThen(e3).accept(EmployeeRepo.getEmployee());
	System.out.println("*************************************");
	System.out.println("*************************************");
	System.out.println("Below Get All Employees :");
	printNameAndHobbies();
	
	System.out.println("*************************************");
	System.out.println("*************************************");
	System.out.println("Below print with condition :");
	printWithCondition();
	System.out.println("*************************************");
	System.out.println("*************************************");
	System.out.println("Below print with condition :");
	printWithCond1();
}
}
