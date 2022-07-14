package Lab;

import java.util.Scanner;

interface AdvAri{
	  int sum(int n);
	}

	
	class Cal implements AdvAri {
	    public int sum(int n) {
	        int sum=0;
	        for(int i=1;i<=n;i++) {
	            if(n%6==0)
	                sum+=i;
	        }
	        return sum;
	    }
	}
	class Main1{
	    public static void main(String []args){
	        Cal my_calculator = new Cal();
	        System.out.print("I implemented: ");
	        ImplementedInterfaceNames(my_calculator);
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        System.out.print(my_calculator.sum(n) + "\n");
	      	sc.close();
	    }
	    
	    static void ImplementedInterfaceNames(Object o){
	        Class[] theInterfaces = o.getClass().getInterfaces();
	        for (int i = 0; i < theInterfaces.length; i++){
	            String interfaceName = theInterfaces[i].getName();
	            System.out.println(interfaceName);
	        }
	    }
	}