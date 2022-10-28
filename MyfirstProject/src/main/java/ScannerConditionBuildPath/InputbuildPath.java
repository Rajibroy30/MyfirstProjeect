package ScannerConditionBuildPath;


import java.util.Scanner;
import java.util.Random;

public class InputbuildPath {
	public static String Start = ("");
	public static void Inputs() {
		
Scanner KeyboardInputs =  new Scanner (System.in); // This is Scanner
		
		System.out.print("Enter Your Name : ");
		String name = KeyboardInputs.nextLine();
		
		System.out.println("\nHey "+ name + "! "
				+ "\nLet's Play a game of \" Find The Wodden BOX \" ");
		
		
		System.out.print("\nHow old are You : ");
		int age = KeyboardInputs.nextInt();// This is Scanner user Keyboard Input
	
		if (age >= 18 && age <=38 ) { // This is "IF" and "ELSE" statement
			System.out.println("\nOK, You may start the GAME !!!!");
		}
		else if (age <= 17) {
			System.out.println("You cannot play the GAME!!!!"
					+ "\nSorry!");
		}
		else if (age >= 39) {
			System.out.println("You cannot play the GAME!!!!"
					+ "\nYou are too old man Go do some OLD people stuff"
					+ "\nSorry!");
		}
		
		 if (age >= 18 && age <=38) {
		System.out.println("Type \"yes\" to START or \"no\" to "
				+ "EXIT Your GAME!!!! "
				+ "\n(Hint: Java Index)");
		
		System.out.print("\nGAME : ");
		
		Start = KeyboardInputs.next();
		if ( Start.equals("yes")) {
			InputbuildPath22.game();
			
		}  
			
			else if ( Start.equals("No")) {
				System.out.print("Thank You! "
						+ "\nHope to see you AGAIN");
			}
	
		 }
		 KeyboardInputs.close();
	}
	
	public static void main(String[] args) {
		InputbuildPath.Inputs();
		
		
		
	}
	
	
	}	

