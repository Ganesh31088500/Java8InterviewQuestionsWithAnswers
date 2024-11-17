package com.example.demo.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
public static void main(String[] args) {
	BiConsumer<Integer , Integer> biCon1=(a,b) -> System.out.println("Add :"+(a+b));
	biCon1.accept(10, 20);
	List<Integer> list1=Arrays.asList(new Integer(10),new Integer(10),new Integer(10));
	List<Integer> list2=Arrays.asList(new Integer(10),new Integer(10));
	BiConsumer<List<Integer>, List<Integer>> biCon2=(l1,l2)->{
		if(l1.size() ==l2.size()) {
			System.out.println("true");
		}
		else {
			System.out.println("False");
		}
	};
	biCon2.accept(list1, list2);

}
}
