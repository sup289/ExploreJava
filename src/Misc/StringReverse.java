package Misc;

public class StringReverse {
 public static void main(String[] args) {
	 String firstString = "name", reversedString="";
	 char ch1;
	 for(int i=0;i<firstString.length();i++)
	 {	
		 ch1 = firstString.charAt(i);
		 reversedString = ch1+reversedString;
	 }
	 System.out.println(reversedString);
}
}
