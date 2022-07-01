


import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number is arm or not ");
        int n = sc.nextInt();

        int i, j;
        int k = 0;

        i = n;

        while (i != 0){
            j = i % 10;
            k += Math.pow(j, 3);
            i /= 10;
        }

        if (k == n)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}