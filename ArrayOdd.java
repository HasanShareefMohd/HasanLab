package Lab2;

public class ArrayOdd {
	public static void main(String[] args) {  
         int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};   //Initialize array    
          System.out.println("array odd position: ");  
  for (int i = 0; i < arr.length; i = i+2) {   // here array incrementing value of i by 2 through the loop 
            System.out.println(arr[i]);   
        }    
    }  
}  

