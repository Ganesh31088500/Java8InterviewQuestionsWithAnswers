package com.example.demo;

import java.util.stream.IntStream;

public class PrimeS {
	

	public static void main(String[] args){
		IntStream.iterate(2, i -> i + 1)
        .filter(PrimeS::isPrime1)
        .limit(7)
        .forEach(System.out::println);
		
		
		int count=0;
		int n=2;
	
	while(count<7){
	if(isPrime(n)){
	System.out.println(n);
	count++;
	}
	n++;
	}
	}
	static Boolean isPrime(int n){
	if(n<=1){
	return false;
	}
	for(int i=2;i<=Math.sqrt(n);i++){
	if(n%i==0){
	return false;
	}

	}
	return true;
	}
	
	  private static boolean isPrime1(int number) {
	        return IntStream.rangeClosed(2, (int) Math.sqrt(number))
	                        .allMatch(n -> number % n != 0);
	    }
	
}
