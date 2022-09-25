package com.collections;

import java.util.Arrays;

public class ArrayExample {
	
	public static void grocery() {	
	
		String[] cart = { "Milk", "Eggs", "Cheese", "Carrots","Chiips"};
		
		//CartItems is a Refrence Variable
		String CartItems = Arrays.toString(cart);
		
		//Printing all the the items
		System.out.println(" I have  these items in the carts" + CartItems );
		
		//Printing one of the items 
		System.out.println("The value at the second index is :"+ cart[2]);
		
		//Print all the lines using a for loop
		for (int i=0; i<cart.length; i++) {
			System.out.println("The for Loop contains these values :" +cart[i]);
		}
	}
	
	
	
public static void main(String[] args) {
	ArrayExample.grocery();
	}
}