package Lab2;

public class ArrayValue {
	public static boolean contains(int[] arr, int item) { //return type of method
	      for (int n : arr) { 
	        if (item == n) { //loop used for check elements
	            return true;
	         }
	      }
	      return false;
	}
	   public static void main(String[] args) { //main method
		  
	      int[] my_arr1 = {1, 2, 3, 4, 5};
	    		  
	      
		System.out.println(contains(my_arr1, 4)); //dispaying true value
	      System.out.println(contains(my_arr1, 7)); // displaying flase value
	   }
	}


