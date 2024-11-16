package com.example.demo;

import java.util.Comparator;

public class ComparatorLambdaExample {
public static void main(String[] args) {
	//Before  java 8
		Comparator<Integer> comparator=new Comparator<Integer>() {
			
			@Override
			public int compare(Integer x, Integer y) {
				// TODO Auto-generated method stub
				return x.compareTo(y);
			}
		};
	System.out.println("comparator 1:"+comparator.compare(150,100));
		//After Java 8
		Comparator<Integer> comparator1= (Integer x,Integer y) -> x.compareTo(y);
		System.out.println("Compatator 1 :"+comparator1.compare(15, 15));
}
	
}
