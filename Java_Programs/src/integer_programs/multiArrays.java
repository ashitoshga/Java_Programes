package integer_programs;

public class multiArrays {

	public static void main(String[] args) {
		//To store data as a tabular form, like a table with rows and columns.
		//Add each array within its own set of curly braces, 
		//eg- for 2 rows array add 2 curly braces
		//to access the element specify array number and then item index
		int[][] a = {{0,1,2,3},{4,5,6,7,8,9}};
		
		// to access 2nd array and its elements use a[1][item index]
		System.out.println(a[1][0]);
		//OP should be first item of 2nd array i.e. 4
		
		
		// to access 1st array and its elements use a[0][item index]
				System.out.println(a[0][3]);
				//OP should be first item of 2nd array i.e. 4
				
		//5 dimensional(5 rows array)
		int[][] b = {{0,1,2,3},{4,5,6,7,8,9},
					{10,11,12,13},{20,21,22,23},
					{30,31,32,33}						
					};
		//To access 4th row or last array items
		System.out.println(b[4][3]);
		//OP should be first item of 2nd array i.e. 4

	}

}
