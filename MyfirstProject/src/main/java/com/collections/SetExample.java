package com.collections;

import java.util.*;

public class SetExample {

	
	public static void main(String[] args) {
		
		Set <String> knives = new HashSet <String>();
		
		knives.add("Steak");
		knives.add("Fishing");
		knives.add("Butter");
		knives.add("Butter"); // only holds single value (no duplicate)
		knives.add("Butter");
		knives.add(null);
		knives.add(null);     // only holds single value (no duplicate)
		knives.add("Steak");  // only holds single value (no duplicate)

		System.out.println(knives);
		
		
		//Insertion order is maintained in LinkHashSet
		//One null Value
		// No Duplicate Value
		
		Set <String> toy = new LinkedHashSet <String>();
		toy.add("Trains");
		toy.add("Doll");
		toy.add("Car");
		toy.add("Car");  // only holds single value (no duplicate)
		toy.add(null);
		toy.add(null);   // only holds single value (no duplicate)

		System.out.println(toy);
		
		//Insertion order is Ascending
		//Natural order is same as Ascending order
		// No Duplicate Value
		// No Explicit Null Value
		
		Set <String> employees = new TreeSet <String>();
		employees.add("Movee");
		employees.add("Nahid");
		employees.add("Aqib");
		employees.add("Mostafa");
		employees.add("Movee");  // only holds single value (no duplicate)
		employees.add("Nahid");  // only holds single value (no duplicate)
//		employees.add(null);
//		employees.add(null);   NULL is not allowed


		System.out.println(employees);

		
		
		
		
		
	}
	
}
