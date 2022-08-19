package Lab_18thAugest;

import java.util.HashMap;
import java.util.Map.Entry;

public class ProblemStatement3 {
	//public static void main(String[] args) {
		HashMap<String,String> M1=new HashMap<String,String>();

		void storeCountryCapital(String CountryName, String capital) {
			//this is the first  method
			M1.put(CountryName, capital);
		}
		void retrieveCapital(String CountryName) {
			//this is the second method
			
			for (Entry<String, String> en:M1.entrySet()) {
				// here is for each loop to get key value
				
				System.out.println(en.getKey()+":"+en.getValue());
			}
		}

		void retrieveCountry(String capitalName) {
			for (Entry<String, String> en:M1.entrySet()) {
				//for each loop to get key value
				
				System.out.println(en.getKey()+":"+en.getValue());}

		}

public static void main(String[] args) {
			ProblemStatement3 m=new ProblemStatement3(); //creating object of class
				m.storeCountryCapital("india", "delhi");  //calling the method
				m.storeCountryCapital("England", "london");
				m.retrieveCapital("india");
				m.retrieveCountry("delhi");
			}

		


}
