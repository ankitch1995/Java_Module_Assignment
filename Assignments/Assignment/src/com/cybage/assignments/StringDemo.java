package com.cybage.assignments;

import java.util.Scanner;

public class StringDemo {
	public static void main3(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name	: ");
		String str1 = sc.next();
		System.out.println(str1);
	}
	
	// compareTo --> compare two string "lexicographically"
	
	public static void main(String[] args) {
		String str1 = "ankitchakraborty";
		String str2 = "sanjaychakraborty";
		
		//int x = str1.length();
		//System.out.println(x);
		
		if(str1.compareTo(str2) > 0) {
			System.out.println("str1 is greater");
		}else
			System.out.println("str2 is greater");
		
		// Using ternary operator
		System.out.println(str1.compareTo(str2)>0?"Yes":"No");
		
		System.out.println(str1.substring(0, 1).toUpperCase()+str1.substring(1, str1.length()));
		//str1.length() --> because it will print one less char.
	}
	
	
	public static void main1(String[] args) {
		String str1 = "AnkitChakraborty";
		//A => Index 0
		System.out.println("Substring starting from index  	:"+str1.substring(5));	// Chakraborty  C=> index 5
		
		System.out.println("Substring starting from index  	:"+str1.substring(0, 5));
		// A=> 0 index
		// (0 , 5) -> start with 0 index and will stop at index 4 => total 5 character.

	}

}
