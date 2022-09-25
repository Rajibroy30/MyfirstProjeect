package com.inheritance;

public class ClassA {

	public static void main(String[] args) {
		ClassA obj = new ClassA();
		obj.Student();
		obj.Teacher();
		ClassA.Boards();
		obj.Laptops();
		
	}
		
		void Student() {
		System.out.println("This is a Student");
	
}
	
		void Teacher() {
			System.out.println("This is a Teacher");
		}
		
		int Laptops() {
		return 10;
		//System.out.println("Students have " + Laptops +" laptops");
		
		}
		static void Boards() {
			System.out.println("We whrite on the Boards");
			
			
			
		}
		
		
		
}
