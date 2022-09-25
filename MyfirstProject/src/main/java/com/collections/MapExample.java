package com.collections;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		
		
		// If no data type Specific, it is generic
		//Map borough = new HashMap();
		// HashMap does not have insertion order
	Map <String,String > borough = new HashMap <String,String >();
	
	
	borough.put("Yello", "Bronx");
	borough.put("Blue", "Manhttan");
	borough.put("Green", "brooklyn");
	borough.put("Violet", "Queens");


	borough.put("Brown", "Hicksville");  		// only holds single value (no duplicate)
	borough.put("Brown", "Greatneck"); 	 		// only holds single value (no duplicate)
	borough.put("Brown", "Staten Island");
	borough.put("Orange", null);
	borough.put("Red", null);
	borough.put("Grey", null);           		// Map can have multiple NULL value 
	
	borough.put( null, "Garden City"); 		    // Map only has one NULL key
	borough.put( null, "New Hyde Park"); 


	System.out.println(borough);
	
	// How to print Map each line ? Use the advantage for loop
	for (Map.Entry < String, String > M : borough.entrySet() ) {
	
	System.out.println("Key :" +M.getValue() + " - Value :"+ M.getValue());
	}
	
	Map <Integer,String > employees = new LinkedHashMap <Integer,String >();
	employees.put(10 ," Movee");
	employees.put(50 ," Nahid");
	employees.put(30 ," Aqib");
	employees.put(40 ," Mostafa");
		
	System.out.println(employees);
	
	Map <Integer,String> Deperments = new TreeMap <Integer,String>();
	Deperments.put(10, " IT");
	Deperments.put(20, " Finence");
	Deperments.put(30, " Account");
	Deperments.put(40, " HR");
	Deperments.put(25, " Administration");
	Deperments.put(35, null);
	Deperments.put(45, null);
	
	System.out.println(Deperments);
	}
	}

