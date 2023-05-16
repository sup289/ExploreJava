package Misc;

public class ReverseArray {
	public static void main(String[] args) {
		
		//method1
		int[] studentID = {1, 2, 3};
		String[] s1 = {"this", "is", "a", "word"};
		for (int i =s1.length-1; i>=0; i--)
		{
			System.out.print(s1[i]+ " ");
		}
		
		
		//method 2
//		int[] roleNo = {1, 2, 3};
//		int temp;
//		for (int i =roleNo.length-1; i>=0; i--)
//			{
//				temp = roleNo[i];
//				roleNo[i] = roleNo[i--];
//			}
//		
//		for (int k =0; k<roleNo.length; k++)
//			{
//				System.out.print(roleNo[k]+ " ");
//			}
	}
}
