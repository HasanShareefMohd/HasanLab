package Lab2;

import java.util.ArrayList;

public class ArrayStudent11 {
	
	int no;
     String name;
    String address;
    String email;
	int fee;
    ArrayStudent11(int no, String name, String address, String email,int fee) { //constructor 
	
    	this.no=no;  //instance varaiable
    	this.name=name;
    	this.address=address;
    	this.email=email;
    

   
    	if(fee <= 2000) {
    
   fee =fee+ (10*fee/100);
    }
    this.fee = fee;
}


	

public void dispaly() {
	System.out.println("Student no: "+no+", Student Name: "+name+", Student Email: "+email+"Student Address: "+address+"Student fee: "+fee);
}




public static void main(String[] args){ // main method
	ArrayStudent11 at[]= new ArrayStudent11[5];//array declaring
	at[0] = new ArrayStudent11(111, "Hasan", "Hasan@gmail", "Hydrabad",1000);
	at[1] = new ArrayStudent11(222,"Shareef", "shareef@gmail", "karimanagar",1500 );
	at[2] = new ArrayStudent11(333,"Mohd", "Mohd@gmail", "Warangal",2000);
	at[3] = new ArrayStudent11(444,"Ashu", "Ashu@gmail", "Khammam",3000);
	at[4] = new ArrayStudent11(555,"Areef", "Areef@gmail", "adilabad",2500 );
	for(ArrayStudent11 i : at){ // here we are intiliazing the array
		i.dispaly();// calling display method
		
	}
	
	
}





}

	


	
