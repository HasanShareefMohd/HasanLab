/* Take a variable from the scanner class 
Given two strings of lowercase a and b
calculate the sum of length of two strings a and b 
Determine if a is greater than b 
then print true else vice versa
capitalise the 1st letter of a and b and print togethe*/
package Hasan_Lab_Oct_13th;

import java.util.Scanner;

public class String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String:");
		String s1 = sc.next();
		s1 = s1.toLowerCase();
		System.out.println("Enter second String:");
		String s2 = sc.next();
		s2 = s2.toLowerCase();
		string1(s1, s2);

	}

static void string1(String s1, String s2) {
		
		
		int f1= s1.length();
		int f2= s2.length();
		int sum = f1 + f2;

		System.out.println("Length of both strings:" + sum);
		if (s1.compareTo(s2) > 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		System.out.println(s1.substring(0, 1).toUpperCase() + s1.substring(1) + " " + s2.substring(0, 1).toUpperCase()
				+ s2.substring(1));
	}


}

}