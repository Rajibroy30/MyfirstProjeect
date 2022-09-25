package com.constructor;

public class Building {
	//Because the method name Building has the same name as the class
			//building, it is a constructor. 
			 //default constrstructor 
			Building(int floors, int windows) {
				 
				System.out.println("Adding new tiles in the kitchen");
				
			 }
			
			//Parameterized Constructor- Every time you create an object, you must
			//pass the values in the Parameterized
//			Building(int floors){
										//+ is concatination adding the 2 thing
				//System.out.println("The building has "+ floors +" floors total");
			//}
			
			
//			Building(int floors, int windows){
//				System.out.println("The building has "+ floors +" floors "
//						+ "total and " +windows +" windows total");
//			} 
			
			void counter() {
				System.out.println("Adding marble counters in the kitchen");
			}
			
			void counter(String livingRoom) {
				System.out.println("Adding marble counters in the "+livingRoom);
			}
			
			public static void main(String[] args) {
				
				Building obj = new Building(0, 0);
				obj.counter();
			}
			 
			 
			
		}

