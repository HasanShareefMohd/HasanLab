


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
    	//here creating scanner object
        Scanner in = new Scanner(System.in);
        // taking input from the user
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("factorial of "+ n + " is " + f);
    }
}
