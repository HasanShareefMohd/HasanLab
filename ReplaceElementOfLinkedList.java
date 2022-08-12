package Lab_12thAugest;

import java.util.LinkedList;

public class ReplaceElementOfLinkedList {
	public static void main(String[] args) {
        LinkedList<String> a1= new LinkedList<String>();//Creae a first list and add some colors to the list
        a1.add("Red");
        a1.add("Green");
        a1.add("Black");
        a1.add("White");
        a1.add("Pink");
        System.out.println("First linked list: " + a1);
        
        a1.set(1, "Black");// Replacing 2nd element with new value
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + a1);
 }

}
