/*Given a number N for each integer i in the range of 1toN print one value per line from the following:
i)if i is a multiple of 3 and 5 print GoodMorning
ii) if i is  a multiple of 3 not 5 print Good
iii) if i is a multiple of 5 not 3 print Morning
iv) if i is not a multiple of 3 and 5 then print the value of i*/
package Hasan_Lab_Oct_13th;
import java.util.Scanner;
public class GM {
	int n;
	Scanner sc=new Scanner(System.in);
	public void display() {
		System.out.println("Enter an integer:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0)
				System.out.println("Good Morning");
			else if(i%3==0 && i%5!=0)
				System.out.println("Good");
		
			else if(i%3!=0 && i%5==0)
			System.out.println("Morning");
	
			else if(i%3!=0 && i%5!=0)
		System.out.println(i);
		}		
}	
	public static void main(String[] args) {
		GM m=new GM();
		m.display();

	}

}

