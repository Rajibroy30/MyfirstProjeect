package com.collections;

import java.util.*;



public class LinkedlistAndVector {


public static void main(String[] args) {
	
	LinkedList <String> name = new LinkedList <String> ();
	
	name.add("Pappu");
	name.add("Manna");
	name.add("Rajib");
	
	System.out.println("The names are : "+name);
	
	List <String> books = new Vector <String> ();
	books.add("Harry Potter");
	System.out.println("Favroite book is :" + books);

}
}
