package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the bit number: ");
		int n = input.nextInt();
		
		boolean result = and(n);
		System.out.print("Result of 'AND' operation: ");
		showResult(result);
		
		result = or(n);
		System.out.print("Result of 'OR' operation: ");
		showResult(result);

		input.close();
	}
	
	public static boolean and(int number) {
		
		int mask = 0b00100000;
		if ((number & mask) != 0 ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean or(int number) {
		
		int mask = 0b00100000;
		if ((number | mask) != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void showResult(boolean result) {
		if (result) {
			System.out.println("The 6th bit is true!");
		} else {
			System.out.println("The 6th bit is false");
		}
	}
	
}
