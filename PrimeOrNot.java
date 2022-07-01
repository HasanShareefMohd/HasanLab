


import java.util.Scanner;
public class  PrimeOrNot{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter and check the number is prime or not: ");
        int n = sc.nextInt();
        checkPrime(n);
    }

    public static void checkPrime(int n) {
        int count = 0;
         if (n < 2)
            System.out.println ("The no is " + n + " is not prime");

        
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count += 1;
        }

        // >2 then its not prime
        if (count > 2)
            System.out.println ("The no is" + n + " is not prime");

        else
            System.out.println ("The no is" + n + " is prime");
    }
}