package com.example.demo;
@FunctionalInterface
public interface TestInterface {
public void add();
static int substitute(int x,int y) {
	int c=x-y;
	return c;
}
default String sayHi() {
	
	return "Hi";
}
}
