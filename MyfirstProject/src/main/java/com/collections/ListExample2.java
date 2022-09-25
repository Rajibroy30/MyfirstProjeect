package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
	//You have to create the line in the method
	
	public void clothes() {
	
		List <String> items = new ArrayList <String>();
	items.add("Shoes");
	items.add("Shirt");
	items.add("Pants");
	items.add("Tie");
	
	System.out.println(items);
	for (int i=0; i<items.size(); i++) {
		System.out.println("The for Loop contains these values :" +items.get(i));
	}
	
	if (items.contains("Shirt")) {
		System.out.println("My list contains shirt");
	}
	else {
		System.out.println("My list doesnt contains shirt");
		
	};
		}
	
	
	public static void main(String[] args) {
		ListExample2 obj = new ListExample2();
				obj.clothes();
		
	}

}
