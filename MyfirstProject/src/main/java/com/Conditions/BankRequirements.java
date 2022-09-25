package com.Conditions;

public class BankRequirements {
	
	public void fees() {
		int balance = 50;
	
		if (balance >= 100) {
			System.out.println("The Customer do not need to pay any maintence fee");
		}
		else {
			System.out.println("The customer is low on balance. Send a bill");
			
		}
	
	}
	
	public void CreateAccount() {
		int age = 18;
		if (age >= 18) {
			System.out.println("Customer is allowed to create an account");
		}
		
	else if (age > 16) {
		System.out.println("Need to have parent's permission to create an account");
		
	}
	
		else if (age < 16){
			System.out.println("Cannot Create a bank accounts");
		}
	}

	public void bonus() {
		int amount = 4000;
		if (amount > 5000) {
			System.out.println("Give customer interest of 2 percent");
			}
		else {
			System.out.println("The customer will not get any Bonus");
		}	
	}
	

	
	
	
	public static void main(String[] args) {
		BankRequirements obj = new BankRequirements();
//		obj.fees();
		obj.CreateAccount();
		//obj.bonus();
		
		
	}
}

