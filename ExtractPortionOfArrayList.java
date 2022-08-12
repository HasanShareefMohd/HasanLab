package Lab_12thAugest;

import java.util.ArrayList;
import java.util.List;

public class ExtractPortionOfArrayList {
	public static void main(String[] args) {
		  List<String> list_Strings = new ArrayList<String>(); // Creae a list and add some colors to the list
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("Original list: " + list_Strings);
		  List<String> sub_List = list_Strings.subList(0, 2);
		  System.out.println("List of first three elements: " + sub_List);
		 }
		}


