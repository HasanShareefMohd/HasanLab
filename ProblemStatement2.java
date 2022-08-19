package Lab_18thAugest;

import java.util.HashSet;

public class ProblemStatement2 {
	String country;
		HashSet<String>H1=new HashSet<String>();   // here we are creating a hashset
	HashSet<String> storeCountryNames(String CountryName) {       //this is the first method

		H1.add(CountryName);
		return H1;
	}
	
	  void  retrieveCountry(String CountryName) {        //this is the second method 
		if(H1.contains(CountryName)) {    // loop for present logic
			System.out.println(CountryName+": Country present in hashmap");
		}
		else {	
		System.out.println("null");
		}
	 }
	
	public static void main(String[] args) {
		//creating object
		ProblemStatement2 h=new ProblemStatement2();
		System.out.println("hashmap country "+h.storeCountryNames("india"));
		h.retrieveCountry("india");
	
	}

}
	


