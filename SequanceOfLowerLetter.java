package Lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SequanceOfLowerLetter {
	public static void main(String[] args) {
		String s = "java_exercises";
		String s1 = "Java_Exercises";
		checkRegex(s);// Calling the method to see the output
		checkRegex(s1);
			
	}
	
	public static void checkRegex(String s) {
		 String regex = "^[a-z]+_[a-z]+$";
		 
		
	        Pattern p = Pattern.compile(regex);// Compile the ReGex
	        
	     
	        Matcher m = p.matcher(s);// Find match between given string
		    
	        if (m.matches()) // if true then it will print if block otherwise else block
	            System.out.println("Found a  Sequance match"); // & regular expression
	        
	        else
	            System.out.println("Not found a Sequance match");
	}
	

}


