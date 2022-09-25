package com.encapsulation;

public class Accountants {
public static void main(String[] args) {
		
		Banks obj = new Banks ();
		
		obj.setName("Franklin");
		System.out.println(obj.getName());
		obj.setAccountNumber("AB001");
		obj.setBalance(1000);

	
	
	obj.setName("movee");
		System.out.println(obj.getName());
		obj.setAccountNumber("AB002");
		obj.setBalance(1500);
		}
	
	
}

