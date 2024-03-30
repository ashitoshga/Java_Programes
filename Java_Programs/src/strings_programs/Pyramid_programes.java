package strings_programs;

import java.util.Scanner;

public class Pyramid_programes {
	
	//print pyramid for alphabets for given num of rows
	//			A
	//		   AB

	
	
	
	public static void create_pyramid()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num of rows to create a Pyramid");
		int rows = sc.nextInt();
		
		//initialize ASCII value for A 
		int asciiValue = 65;
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<rows-i-1; j++)
			{
				System.out.print(rows-i-1);
				//First print number of blank spaces(column)
				System.out.print(" ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print(j);
				//Now print actual alphabets for each row
				//Upcast int to char
				System.out.print((char)(asciiValue+j)+" ");
			}
			
			//Move to the next row
				System.out.println();			
			
		}
		sc.close();			
		
	}
	
	
	public static void main(String[] args) {
		
		create_pyramid();
	}

}
