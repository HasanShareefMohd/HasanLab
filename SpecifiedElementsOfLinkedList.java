package Lab_12thAugest;

import java.util.LinkedList;

public class SpecifiedElementsOfLinkedList {
	 public static void main(String[] args) {
		   
		     LinkedList<String> l_list = new LinkedList<String>();// create an empty linked list
		          l_list.add("Red"); // use add() method to add values in the linked list
		          l_list.add("Green");
		          l_list.add("Black");
		     System.out.println("first linked list:" + l_list);    
		  
		     l_list.offerFirst("Pink");// Add an element to front of LinkedList
		     System.out.println("Specified linked list:" + l_list);  
		 }	
		}


