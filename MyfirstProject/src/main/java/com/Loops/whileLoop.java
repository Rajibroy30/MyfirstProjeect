package com.Loops;

public class whileLoop {
	public static void repeatMoreNumbers() {
		
		int i = 10;
		
		// while loops use true and false condition. 
		//If you dont know the number times to repeat the value,
		//use the while condition
				while (i == 10) {
					System.out.println(i);
				}
		}
	public static void reapeatWhileLoop() {
		
		while (true) {
			System.out.println("I am infinite");
		}

	}
	public static void main(String[] args) {
		whileLoop.repeatMoreNumbers();
		whileLoop.reapeatWhileLoop();
	}


	}

