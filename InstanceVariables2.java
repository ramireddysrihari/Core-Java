package com.corejava;
class InstanceVariables2 {
	// Creating a instance variables
	// for instance variables we need to create object to access variables.
	//here we are declaring a values directly to a variables.
	int a = 10;
	String name = "Sreehari";
	//we can create object in class level by declaring STATIC keyword 
	static InstanceVariables2 i = new InstanceVariables2();

	public static void main(String[] args) {
		System.out.println(i.a);
		System.out.println(i.name);

	}

}
