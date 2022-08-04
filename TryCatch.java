package Aug4th_LabSession;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) { //Main method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		
		try {
			int a = sc.nextInt(); // first userInput
			int b = sc.nextInt(); // of second userInput
			System.out.println(a/b);  
			
		}
		catch(InputMismatchException e) { // printing InputmismatchedException
			e.printStackTrace();
		}
		catch(ArithmeticException e) { // printing the exception 
			e.printStackTrace();
		}
		catch(Exception e) { // print exception
			e.printStackTrace();
		
		}
		
	}

}

