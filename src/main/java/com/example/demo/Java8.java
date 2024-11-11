package com.example.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {
		String s="Ganesh Pitchuka";
	Map<String, Long> eachOccurence=	    Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("Find the occurance of each character"+ eachOccurence);

List<String> duplicateElements = Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
		.filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
System.out.println("Find the duplicate elements :"+duplicateElements);


List<String> uniqueElements = Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
		.filter(e -> e.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
System.out.println("Find the unique elements :"+uniqueElements);

 String findNonRepeating=        Arrays.stream(s.split(""))
		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet()
		.stream().filter(e -> e.getValue() == 1).map(x -> x.getKey()).findFirst().get();
 
 System.out.println("Find the first non repeating elements :"+findNonRepeating);
 
 int[] arr1= {1,22,32,4,5,44,62};
 int[] arr2=Arrays.stream(arr1).toArray();
 System.out.println("Copy array from another array: "+arr2.toString());
 int n=3;
 int nthh=arr1.length-n;
 Integer nthLargestElement= Arrays.stream(arr1).boxed().sorted().skip(arr1.length-n).findFirst().get();
 System.err.println("nthLargest Element :"+nthLargestElement + "nth :" +nthh);
 List<String> EndWith2=             Arrays.stream(arr1).boxed().sorted().map(x -> x+"").filter(x->x.endsWith("2")).collect(Collectors.toList());
         System.out.println("EndsWith2 :"+EndWith2);     
      
 
 String str="Gaanesh";
 String rev="";
 for(int i=str.length()-1;i>=0;i--) {
	 rev+=str.charAt(i);
 }
 System.out.println("Reverse the string :" +rev);
 
 
 String str1="Ganesh Sai";
 String[] words=str1.split(" ");
 String rev1="";
 for(String word: words) {
	 for(int i=word.length()-1;i>=0;i--) {
		 rev1+=word.charAt(i);
		 
	 }
	 System.out.println(rev1);
	 rev1="";
 }
 
 
 List<Integer> list=Arrays.asList(2,4,5,3,4,2,6,7,8,0);
 Set<Integer> set1=new HashSet<Integer>();
  Set<Integer> set=         list.stream().filter(x -> !set1.add(x)).collect(Collectors.toSet());
  System.out.println(set);
  int[] arr3= {1,22,32,4,5,44,62};
  int[] arr4= {1,22,32,2};
   List<Integer> commonElements=           Arrays.stream(arr3).distinct().filter( number -> Arrays.stream(arr4).anyMatch(arr4Number -> arr4Number==number)).boxed().collect(Collectors.toList());
              System.out.println("Common Elements :"+commonElements);
              
              String str3="I am Ganesh pitchuka H Laptop";
              List<String> list3=Arrays.asList(str3.split(" "));
       Map<Integer, List<String>> stringlength=       list3.stream().collect(Collectors.groupingBy(String::length));
       System.out.println(stringlength);
       
 List<Double> square=      list.stream().map(x -> Math.pow(x, 2)).filter(x -> x>10).collect(Collectors.toList());
 System.err.println(square);
 
 List<String> listOfStrings=Arrays.asList("Facebook","Twitter","Youtube");
 String joinedString=listOfStrings.stream().collect(Collectors.joining(",","[","]"));
 System.out.println(joinedString);
  
	}

}
