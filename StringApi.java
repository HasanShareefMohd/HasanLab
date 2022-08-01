package Lab5;

import java.util.StringTokenizer;

public class StringApi {
	public static void main(String[] args) {
		String s1 = "Welcome to the Java World";
		System.out.println(s1.charAt(5));// print statement
		System.out.println(s1.compareToIgnoreCase("Welcome"));
		System.out.println(s1.concat("-Let us learn"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.replace('a','e'));
		System.out.println(s1.substring(2, 8));
		System.out.println(s1.toLowerCase());
		
		
		StringBuffer b = new StringBuffer("This is  a StringBuffer");// creating object for StringBuffer
		System.out.println(b.append("This is a sample program"));
		System.out.println(b.insert(19, "Object"));
		System.out.println(b.replace(12, 18, "Builder"));
		System.out.println(b.reverse());
		
		System.out.println("3rd Statement");
		
		parseString();
	}
	

public static void parseString()
{
StringTokenizer st= new StringTokenizer("C:\\Users\\Admin\\Desktop\\HelloWorld", "\\");
System.out.println("Drive:" + st.nextToken() + "\\" + "\n" + "Folders:" +st.nextToken() + "||"
+  st.nextToken() +  "||" + st.nextToken() + "\n" + "Files:" + st.nextToken());

}
}

