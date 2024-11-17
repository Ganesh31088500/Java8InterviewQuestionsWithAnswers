package com.example.demo.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.employee.Employee;
import com.example.demo.employee.EmployeeRepo;

public class StreamFlatMapExample {
	static List<String> hobbies(List<Employee> empList){
		return empList.stream()
				.map(Employee::getHobbies)
				.flatMap(List::stream)
				//.distinct()
				.collect(Collectors.toList());
	}	static List<String> distincthobbies(List<Employee> empList){
		return empList.stream()
				.map(Employee::getHobbies)
				.flatMap(List::stream)
				.sorted()
			.distinct()
				.collect(Collectors.toList());
	}
	static long countOfHobbies(List<Employee> emplList) {
		return emplList.stream()
				.map(Employee::getHobbies)
				.flatMap(List::stream).distinct().count();
	}
	
public static void main(String[] args) {
	List<Integer> oddNumber=Arrays.asList(1,3,5,7);
	List<Integer> evenNumbers=Arrays.asList(2,4,6,8);
	List<List<Integer>> listOfLists=Arrays.asList(oddNumber,evenNumbers);
	System.out.println("Before flatten: "+listOfLists);//Before flatten: [[1, 3, 5, 7], [2, 4, 6, 8]]
	
	List<Integer> flattenList=listOfLists.stream()
			.flatMap(list -> list.stream())//converting list of integers into list of stream
			.collect(Collectors.toList());
	System.out.println("After flatten: "+flattenList);//After flatten: [1, 3, 5, 7, 2, 4, 6, 8]
	
	System.out.println("**************************");
	System.out.println(hobbies(EmployeeRepo.getAllEmployee()));
	System.out.println(distincthobbies(EmployeeRepo.getAllEmployee()));
	
	System.out.println("**************************");
	System.out.println(countOfHobbies(EmployeeRepo.getAllEmployee()));
}
}
