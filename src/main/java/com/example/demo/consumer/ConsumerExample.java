package com.example.demo.consumer;

import java.util.function.Consumer;

public class ConsumerExample {
public static void main(String[] args) {
	Consumer<String> con1=(s) -> {System.out.println(s.toUpperCase());};
//	con1.accept("Ganesh");  //output: GANESH
	Consumer<String> con2=(s) -> {System.out.println(s.toLowerCase());};
//	con1.accept("Sai");
	Consumer<String> con3=(s) -> {System.out.println(s.substring(2));};
	con1.andThen(con2).andThen(con3).accept("Ganesh");  //output :GANESH,ganesh,nesh
	
	
	
}
}
