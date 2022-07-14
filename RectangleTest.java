package Lab;

import java.util.Scanner;

public class RectangleTest {
	//main method
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		Scanner scan = new Scanner(System.in);
		
		//taking input from user
		System.out.println("Input lenght and breadth of your rectangle...");
		int lenght=scan.nextInt();
		int breadth=scan.nextInt();
		
		//output
		obj.area(lenght, breadth); 		
		scan.close();
		
	}
}
