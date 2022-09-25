
package com.collections;


import java.util.*;

public class ListExample {

	//why do we need a list?
	//To handle the array fixed length problem
	
//	List is a java interface. it has a super interface called Collection which
//	has super interface called Iterable (top level interface)
	
	//Java Collection framework has many interface. list is one of the Interface
	
	//How do you create a list in java?
	
	public static void main(String[] args) {
		
//		Formula for List.class We have to use the datatype using the class. We cannot use
//		primitive data type. We use the Non-primitive data type. Non-primitive data type 
//		is also called the Wrapper Class
		
		List <Integer> number = new ArrayList <Integer> (); 
		
		number.add(10);// index 0
		number.add(15);// index 1
		number.add(10);// index 2
		number.add(30);// index 3
		
		//System.out.println("The number in the liat RE : "+ number);
		
		for (int i = 0; i < number.size(); i++) {
		
		//System.out.println("The number in the list are : " + number.get(i));
	}
		// How to use exact value of index
		System.out.println("The value at index 2 of the list is : " + number.get(2));  

		
		// How to print using advance loop
		for (Integer num : number) {
			System.out.println("The number in the list are : "+ num);
			
			ArrayList <Integer> number1= new ArrayList <Integer> (); 
			number1.add(20);
			number1.add(30);
			
			System.out.println("The value of the array list is "+number1);
		}
		


		
	}
}
