package ScannerConditionBuildPath;

import java.util.Random;
import java.util.Scanner;

public class InputbuildPath22 extends InputbuildPath{
	
public static void game() {	
	Scanner KeyboardInputs =  new Scanner (System.in);
	
		System.out.print("\n \nWhere will you Find the Woddden Box"
				+ "\nDo you want to go Left, Stright or Right"
				+ "\nType \"1\" to go Left , \"2\" to go Stright or \"3\" to go Right");
		
		System.out.print("\n\nDirections : ");	
		int direction = KeyboardInputs.nextInt();
		
		int [] numbers = {0,1,2,3};
		
		 if (direction == numbers[0]) {
			 System.out.println("Congratulation "+  name + " You found the box");
			 while(direction != numbers[0]) {
					InputbuildPath22.game();
					break;
			 }
		 }
	
		  if (direction == numbers[1]) {
			  Random random = new Random();
			  int w = random.nextInt(100);
			  int x = random.nextInt(100);
			  int y = random.nextInt(100);
			  int z = random.nextInt(100);
			  
//			 int []number = {9,12,19,22,19,31}; // This is arrays
//			 int []answers = {21,41,50};// This is arrays
			 
			System.out.println("what is " + w +"+"+ x +":");
			int a = KeyboardInputs.nextInt();
			if (a == x+w) {
				System.out.print("OK " + name +" I see you can do basic math,"
								+ "\nLets Try another one");
			}
				
				else if (a != w+x ) {
					System.out.print("OK "+  name +" I see you can't do basic math,"
							+ "\nLets Try another one"
							+ "\nand You need to learn how to count");
				}
				
			System.out.println("\n\nwhat is " + y +"+"+ z +":");
				int b = KeyboardInputs.nextInt();
				if (b == z+y) {
					System.out.print("Ok I see you know this"
						+ "\nBut can u find THE BOX in the Game");
				}				
					
				//for(int i != numbers[0] ; i < direction ; i++);           // This is for loop
				
			
			else if (b != z+y) {
				System.out.println(name +" Go back to Primary School "
						+ "\nand learn how to count");
		}
				
				
			while(direction != numbers[0]) {
				InputbuildPath22.game();
				
//				System.out.print("\n\nDirections : ");	
//				 direction = KeyboardInputs.nextInt();

			}
		  }		
		 if (direction == numbers[2]) {
			System.out.println("How many sides are there in a Box ");
			
			System.out.print("Sides : ");
			int sides = KeyboardInputs.nextInt();
			
			if (sides == 6) {
			System.out.println( name +" I see that you know a little stuff abut the box,"
		+ "\n But can u find THE BOX in the Game");
			}
			else if (sides != 6) {
				System.out.println(" SMH \"Face Palm\" Wrong Answer "
						+ "\nTry Again");
				System.out.println("\nHow many sides are there in a Box ");
				
				System.out.print("Sides : ");
				int sides1 = KeyboardInputs.nextInt();
				
				if (sides1 == 6) {
				System.out.println( name +" I see that you know a little stuff abut the box,"
			+ "\n But can u find THE BOX in the Game");
			}
			while(direction != numbers[0]) {
				InputbuildPath22.game();
//				System.out.print("\n\nType \"1\" to go Left , \"2\" to go Stright or \"3\" to go Right");
//				
//				System.out.print("\n\nDirections : ");	
//				 direction = KeyboardInputs.nextInt();

			}
		}
}
		if (direction == numbers[3]) {
			System.out.println("What kind of Material is the Box made out of");
			
			System.out.print("Materials : ");
			String material = KeyboardInputs.next();
			 if ( material.contentEquals("wood")  ) {
				System.out.println("Congratulation you know what is the Box id made of"
						+ "\n But can u find THE BOX in the Game");
			}
			
			else if (material != "wood") {
				System.out.println(" SMH \"Face Palm\" Wrong Answer "
						+ "\nTry Again");
				System.out.print("Materials : ");
				String material1 = KeyboardInputs.next();
				 if ( material.contentEquals("wood")  ) {
					System.out.println("Congratulation you know what is the Box id made of"
							+ "\n But can u find THE BOX in the Game");
				}
				
				else if (material1 != "wood") {
					System.out.println(" SMH \"Face Palm\" Wrong Answer "
							+ "\nI dont think YOU can fo this ");

				}
			}
			while(direction != numbers[0]) {
				InputbuildPath22.game();
//				System.out.print("\n\nType \"1\" to go Left , \"2\" to go Stright or \"3\" to go Right");
//				
//				System.out.print("\n\nDirections : ");	
//				 direction = KeyboardInputs.nextInt();
	}
			}
		
		 KeyboardInputs.close();
		}
		
	
		
public static void main(String[] args) {
	InputbuildPath obj =new InputbuildPath();
	obj.Inputs();
	
	
	
			
	
	
	
	
}
}
