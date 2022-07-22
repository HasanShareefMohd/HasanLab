package Lab2;

public class ArrayValue1 {
	public static void main(String[] args) {
		int[]  arr1 = {1, 2, 3, 4, 5};
		boolean found = false; 
		int n = 5;
		for(int x : arr1) {
			if(x==n) { //loop used for check elements
				found = true; //if the array is equal to the given varaible it will print true
				break;
			}
		}
		System.out.println(found);	
	}
}


	

