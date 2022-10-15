package Hasan_Lab_Oct_13th;
/*import java.util.Scanner;
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

}*/

public class GM {
	public class X {

	}

	public static class Y {

	}

	public void instantiatedTest() {

	new GM().new X(); //1

	new GM.Y(); //2

	new X(); //3

	new GM.X(); //4

	}

	}





