package com.corejava;

public class Demo1 {
	// declaring a Static variables
	// Every time the variable should be written in SMALL CHARACTERS and the second
	// letter will be in CAPITAL LETTER.
	// THE VARIABLES ARE TWO TYPES
	// 1)STATIC VARIABLES = THESE VARIABLES ARE PERMANANT WE NEED NOT TO CREATE
	// OBJECT FOR STATIC VARIABLES
	static int a = 10;
	static String name = "SREEHARI REDDY";
	//if we not declare any values to variables the jvm will assign the values to the variables
	//for Numeric it will print "0".
	//for String data type it will gives "NULL".
	static int b;
	static String name1;
	
//we can create variables inside the CLASS only 
	//we are not able to create variables in main method
	//we can call or Acess in main method
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(name);
		System.out.println(b);
		System.out.println(name1);

	}

}
