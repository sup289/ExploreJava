/**
 * 
 */
package Misc;

/**
 * @author spash
 *
 */
public class PrintNumberFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//x for rows, y for columns, and row denotes the number of rows to print 
		int x, y, row=5; 
		//outer loop for number of rows 
		for(x=1; x<=row; x++) 
		{ 
		//inner loop for columns 
		for(y=row-x; y>=0; y--) 
		{ 
		//To prints spaces
		System.out.print(" "); 
		}
		//Inner loop for columns
		for(y=1; y<=x; y++)
		{
		//To prints stars
		System.out.print("* ");
		}
		//Cursor goes to the new line after printing each line
		System.out.println();
		}	

	}

}
