package com.inheritance;

public class ClassC extends ClassB{
	
	
	
	void Books() {
		System.out.println("These are the Books");
	}

	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.Student();
		obj.Teacher();
		obj.Principal();
		obj.Books();


	}

}
