package Lab2;

public class ArrayDup { // declaring class as ArrayDuo
	public static void main(String[] args) 
    {
        int[] my_arr = {1, 2, 3, 3, 4, 5}; //Initialize array
 
        for (int i = 0; i < my_arr.length-1; i++)
        {
            for (int j = i+1; j < my_arr.length; j++)
            {
                if ((my_arr[i] == my_arr[j]) && (i != j))
                {
                    System.out.println("Duplicate value is: "+my_arr[j]); //print statement
                }
            }
        }
    }    

}

