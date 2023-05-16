package Misc;

public class ReverseWords {
	public static void main(String[] args) {
		StringBuilder finalString = new StringBuilder();
		String first = "this is a word";
		String[] splitFirst = first.split(" ");
		for (int i =  splitFirst.length-1; i >=0; i--) {
			finalString.append(splitFirst[i]+" ");
		}
		System.out.println(finalString);
}
}
