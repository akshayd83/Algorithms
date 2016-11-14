import java.util.ArrayList;
import java.util.Arrays;


public class ReverseAString {
	
	public static void main(String[] args) {
		String myString = "HelloWorld";
		
		ArrayList<String> myList = new ArrayList<>();
		
		 myList.add(myString);
		
		//reverseAString(myString.toCharArray());
		reverseMyString(myString);
	}
	
	 static void reverseAString(char[] myString) {
		 for (int i = 0; i < myString.length /2 ; i++) {
			 int other = myString.length - i -1;
			 char temp = myString[i];
			 myString[i] = myString[other];
			 myString[other] = temp;
					 
		 }
		 
		 System.out.println(" my string is" + String.valueOf(myString));
	 }
	 
	 static void reverseMyString(String myString) {
		 StringBuilder sb = new StringBuilder();
		 for (int i = 0; i < myString.length() ; i++) {
			 sb.insert(0, myString.charAt(i));
					 
		 }
		 
		 System.out.println(" my string is : " + sb.toString());
	 }

}
