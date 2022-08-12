package Lab_12thAugest;

import java.util.ArrayList;

public class CompareTwoArrayLists {

	public static void main(String[] args) {
		   ArrayList<String> al= new ArrayList<String>();//Creae a first list and add some colors to the list
		          al.add("Red");
		          al.add("Green");
		          al.add("Black");
		          al.add("White");
		          al.add("Pink");

		          ArrayList<String> al2= new ArrayList<String>();//Creae a second list and add some colors to the list
		          al2.add("Red");
		          al2.add("Green");
		          al2.add("Black");
		          al2.add("Pink");

		          ArrayList<String> al3 = new ArrayList<String>(); //Storing the comparison output in ArrayList<String>
		          for (String e : al)
		             al3.add(al2.contains(e) ? "Yes" : "No");
		          System.out.println(al3);
		         
		     }
		}
