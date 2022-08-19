package Lab_18thAugest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ProblemStatement1 {
	 ArrayList<Integer> A1=new ArrayList<Integer>();

	 ArrayList<Integer> storeEvenNumbers(int N) {   //This is the first method
		 for(int i=2;i<=N;i++) {
		if(i%2==0) {             //this is the logic
			A1.add(i);
		}
		 }
		 return A1;	 
	 }
	 ArrayList<Integer> A2=new ArrayList<Integer>();

	 ArrayList<Integer> printEvenNumbers() {    //This is the second method
		Iterator<Integer> itr=A1.iterator();
		while(itr.hasNext()) {
			A2.add(itr.next()*2);
		}	 
		 return A2;
	 }
	 void retrieveEvenNumber(int n){  //this is the third method
		 if(A1.contains(n)) { 
			 System.out.println("present array list is:");//logic to check the number
			 System.out.println(n);  //this will print present
		 }
		 else {
			 System.out.println("zero");   //this will present zero
		 }
	 }
	public static void main(String[] args) {
		ProblemStatement1 ps=new ProblemStatement1();  //object of class
        System.out.println(ps.storeEvenNumbers(12));
		System.out.println(ps.printEvenNumbers());
		ps.retrieveEvenNumber(8);
	}

}


