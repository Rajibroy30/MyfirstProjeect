package ScannerConditionBuildPath;


import java.util.Scanner;

public class InputbuildPath {
	
	public static void main(String[] args) {
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
				+ "\n(CAUTION JUST BE CAREFULL)");
		
		System.out.print("\nGAME : ");
		 String Start = KeyboardInputs.next();
		
		 
		if ( Start.equals("yes")) {
			System.out.print("Where will you Find the Box"
					+ "\nDo you want to go Left, Stright or Right"
					+ "\nType \"1\" to go Left , \"2\" to go Stright or \"3\" to go Right");
			
			System.out.print("\n\nDirections : ");	
			int direction = KeyboardInputs.nextInt();
			int [] numbers = {0,1,2,3};
			
			 if (direction == numbers[0]) {
				 System.out.println("Congratulation "+ name + " You found the box");
			 }
		
			  if (direction == numbers[1]) {
				
				 int []number = {9,12,19,22,19,31}; // This is arrays
				 int []answers = {21,41,50};// This is arrays
				 
				System.out.println("what is " + number[0]+"+"+number[1]+":");
				int a = KeyboardInputs.nextInt();
				if (a == answers[0]) {
					System.out.print("OK "+ name +" I see you can do basic math,"
									+ "\nLets Try another one");
				}
					
					else if (a != 21) {
						System.out.print("OK "+ name +" I see you can't do basic math,"
								+ "\nLets Try another one"
								+ "\nand You learn how to count");
					}
					
				System.out.println("\n\nwhat is " + number[2]+"+"+number[3]+":");
					int b = KeyboardInputs.nextInt();
					if (b == answers[1]) {
						System.out.print("Ok I see you know this"
							+ "\nBut can u find THE BOX in the Game");
					}				
						
					//for(int i = 0; i < Start; i++);           // This is for loop
					
				
				else if (b != 41) {
					System.out.println(name +" Go back to Primary School "
							+ "\nand learn how to count");
			}
					
					
				while(direction != numbers[0]) {
					System.out.print("\n\nType \"1\" to go Left , \"2\" to go Stright or \"3\" to go Right");
					
					System.out.print("\n\nDirections : ");	
					 direction = KeyboardInputs.nextInt();

				}
			  }		
			 if (direction == numbers[2]) {
				System.out.println("How many sides are there in a Box ");
				
				System.out.print("Sides : ");
				int sides = KeyboardInputs.nextInt();
				
				if (sides == 6) {
				System.out.println( name + " I see that you know a little stuff abut the box,"
			+ "\n But can u find THE BOX in the Game");
				}
				else if (sides != 6) {
					System.out.println(" SMH \"Face Palm\" Wrong Answer "
							+ "\nTry Again");
				}
				while(direction != numbers[0]) {
					System.out.print("\n\nType \"1\" to go Left , \"2\" to go Stright or \"3\" to go Right");
					
					System.out.print("\n\nDirections : ");	
					 direction = KeyboardInputs.nextInt();

				}
			}
			
			else if(direction == numbers[3]) {
				System.out.println("What kind of Material is the Box made out of");
				
				System.out.print("Materials : ");
				String material = KeyboardInputs.next();
				 if ( material.contentEquals("wood")  ) {
					System.out.println("Congratulation you know what is the Box id made of"
							+ "\n But can u find THE BOX in the Game");
				}
				
				else if (material == "wood") {
					System.out.println(" SMH \"Face Palm\" Wrong Answer "
							+ "\nTry Again");
				}
				while(direction != numbers[0]) {
					System.out.print("\n\nType \"1\" to go Left , \"2\" to go Stright or \"3\" to go Right");
					
					System.out.print("\n\nDirections : ");	
					 direction = KeyboardInputs.nextInt();

				}
			}
			
		
		
			  }
		
		else if ( Start.equals("No")) {
			System.out.print("Thank You! "
					+ "\nHope to see you AGAIN");
		}
		
		
		
		}
		
		 KeyboardInputs.close();
	}	
	
}
