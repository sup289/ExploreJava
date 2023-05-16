package Misc;

public class ForTest {
	public static void main(String[] args) {
		
		try {
		for(int i=0;i<3;)
				{
					System.out.println("this is i value ... " +i);
				}
		}
		catch(StackOverflowError e)
		{
			 System.err.println("ouch!");
		}

	}

}
