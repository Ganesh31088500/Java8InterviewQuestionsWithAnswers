package com.example.demo;

import java.util.stream.Collectors;

public class JavaBasics {
	
	//reverse string
	 public static String reverse(String str) {
	        char[] chars = str.toCharArray();
	        int left = 0, right = chars.length - 1;
	        while (left < right) {
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;
	            left++;
	            right--;
	        }
	        return new String(chars);
	    }
	 //is prime
	 public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i * i <= num; i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    } 
	 //factorial
	 public static int factorial(int num) {
	        int result = 1;
	        for (int i = 1; i <= num; i++) {
	            result *= i;
	        }
	        return result;
	    }
	 //palidrome
	 public static boolean isPalindrome(String str) {
	        int left = 0, right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) return false;
	            left++;
	            right--;
	        }
	        return true;
	    }
	 //fibonacci
	 public static void fibonacci(int n) {
	        int a = 0, b = 1;
	        System.out.print("Fibonacci Sequence: " + a + ", " + b);
	        for (int i = 2; i < n; i++) {
	            int next = a + b;
	            System.out.print(", " + next);
	            a = b;
	            b = next;
	        }
	        System.out.println();
	    }
	 
	 public static void countVowelsAndConsonants(String str) {
	        int vowels = 0, consonants = 0;
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowels++;
	            else if (ch >= 'a' && ch <= 'z') consonants++;
	        }
	        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
	    }
	 
	 public static boolean areAnagrams(String str1, String str2) {
	        // If lengths are different, they can't be anagrams
	        if (str1.length() != str2.length()) return false;

	        // Normalize both strings by sorting characters using Java 8 streams
	        String sortedStr1 = str1.chars()
	                                .sorted()
	                                .mapToObj(c -> String.valueOf((char) c))
	                                .collect(Collectors.joining());

	        String sortedStr2 = str2.chars()
	                                .sorted()
	                                .mapToObj(c -> String.valueOf((char) c))
	                                .collect(Collectors.joining());

	        // Compare the sorted versions
	        return sortedStr1.equals(sortedStr2);
	    }
	 public static void main(String[] args) {
		 String str = "hello";
	        System.out.println("Reversed: " + reverse(str));
	        
	        int num = 29;
	        System.out.println(num + " is prime: " + isPrime(num));
	        
	        int num1 = 5;
	        System.out.println("Factorial of " + num1 + " is: " + factorial(num1));
	        
	        String str1 = "madam";
	        System.out.println("Is palindrome: " + isPalindrome(str1));
	        
	        String str2 = "Hello World";
	        countVowelsAndConsonants(str2);
	        
	        String str3 = "listen";
	        String str4 = "silent";
	        System.out.println("Are they anagrams? " + areAnagrams(str3, str4));
	}
}
