package Misc;

public class StringPallindrome {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("yesterday");
		s1.reverse();
		String reverse = s1.toString();
		System.out.println(s1);
		System.out.println(reverse);
		if(s1 == s1.reverse())
			System.out.println("S1 is pallindrome");
		else
			System.out.println("S1 is not a pallindrome");
	}

}
