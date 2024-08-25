package com.corejava;

class InstanceVariables {
	// Creating a instance variables
	// for instance variables we need to create object to access variables.
	//here we are declaring a values directly to a variables.
	int a = 10;
	String name = "Sreehari";
	//we can create object in class level by declaring STATIC keyword 

	public static void main(String[] args) {
		//creating a object in main method
		InstanceVariables i = new InstanceVariables();
		System.out.println(i.a);
		System.out.println(i.name);

	}

}


