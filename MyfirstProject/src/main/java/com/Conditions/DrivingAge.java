package com.Conditions;

public class DrivingAge {
	public void Minimumage() {
		int age = 15;
		if (age >= 17) {
			System.out.println("You are allowed to Drive");
		}
		
	else if (age < 17) {
		System.out.println("Need to have parent's supervisition to Drive");
		
	}
	
		else if (age > 15){
			System.out.println("You Cannot Drive By yourself");
		}
	}
		public static void main(String[] args) {
		DrivingAge obj = new DrivingAge();
		obj.Minimumage();
		
	}

	}

