package com.example.demo.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.demo.employee.Employee;
import com.example.demo.employee.EmployeeRepo;

public class SimpleStreamExample {
public static void main(String[] args) {
	Stream<Integer> s1=Stream.of(1,2,3,4,5,6);//stream.of is help to create stream of data
	s1.forEach(p -> System.out.print(p +","));
	System.out.println();
	Stream<Integer> s2=Stream.of(new Integer[] {7,8,9});
	s2.forEach(p -> System.out.println(p));
	Predicate<Employee> p1=(emp) -> emp.getSalary()>10000;
	Predicate<Employee> p2=(emp) -> emp.getGender().equals("Male");
	Map<String, List<String>> employeeMap=EmployeeRepo
			.getAllEmployee()//iterate all employees
			.stream()//stream of persons
			.filter(p1)
			.filter(p2)
			.collect(Collectors
					.toMap(Employee::getName, Employee::getHobbies));
	System.out.println("Employee Map::"+employeeMap);
	
	List<String> employeeHobbies=EmployeeRepo
			.getAllEmployee()//list of employees
			.stream()//Stream of Employes
			
			.map(Employee::getHobbies)//Stream<List<String>>
			.flatMap(List::stream)//Stream<String>
			.distinct()//find the unique hobbies
			.collect(Collectors.toList());
	
	System.out.println(employeeHobbies);

	
	
}
}
