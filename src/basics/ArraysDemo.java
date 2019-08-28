package basics;

/*
 * Array is a collection of values of similar data type of fixed size. Arrays will store the information in
 * continuous memory locations. We can access array data by index values and this index value starts
 * with 0.
 * 
 * Advantages of arrays over normal variables
 * 1. We can easily store multiple values using single array variable
 * 2. Array data can be accessed easily
 * 3. Sorting and searching of data is easy
 * 
 * There are two types of arrays
 * 1. 1-D arrays
 * 		which will have one row and multiple columns of data
 * 		
 * 		
 * 		//declaration
 * 		data_type[] var_name = new data_type[length];
 * 
 * 		//assigning data
 * 		var_name[index] = value;
 * 
 * 		//retrieve data
 * 		var_name[index];
 * 
 * 		//initialize
 * 		data_type[] var_name = {value0, value1, value2 .... valueN}
 * 		
 * 2. 2-D arrays
 * 		which will store data in multiple rows and multiple columns
 * 		//declaration
 * 		data_type[][] var_name = new data_type[row_length][column_length];
 * 	
 * 		//assign data
 * 		var_name[row_index][column_index] = value;
 * 
 * 		//retrieve data
 * 		var_name[row_index][column_index];
 * 
 * 		//initialize
 * 		data_type[][] var_name = {{r0v1, r0v2, r0v3 ... r0vN},
 * 								  {r1v1, r1v2, r1v3 ... r1vN },
 * 								 
 * 								  {rMv1, rMv2, rMv3 ... rMvN}}
 */
public class ArraysDemo {
	public static void main(String[] args) {
		// declaring 1D array
		int[] marks = new int[6];

		// storing data in the array
		marks[0] = 12;
		marks[1] = 13;
		marks[2] = 11;
		marks[3] = 14;
		marks[4] = 10;
		marks[5] = 11;

		// retrieving data from the array
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);

		// initialization of a 1D array
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		// retrieve the data
		System.out.println(vowels[0]);
		System.out.println(vowels[1]);
		System.out.println(vowels[2]);
		System.out.println(vowels[3]);
		System.out.println(vowels[4]);

		// to find the length of an array we can use length property
		System.out.println(vowels.length);

		// declaring a 2D array
		int[][] matrix1 = new int[3][2];

		// storing data in a 2d array
		matrix1[0][0] = 1; // first row first column
		matrix1[0][1] = 2; // first row second column
		matrix1[1][0] = 3; // second row first column
		matrix1[1][1] = 4; // second row second column
		matrix1[2][0] = 5; // third row first column
		matrix1[2][1] = 6; // third row second column

		// Retrieving data
		// first row
		System.out.print(matrix1[0][0] + "\t");
		System.out.print(matrix1[0][1] + "\n");
		// second row
		System.out.print(matrix1[1][0] + "\t");
		System.out.print(matrix1[1][1] + "\n");
		// third row
		System.out.print(matrix1[2][0] + "\t");
		System.out.print(matrix1[2][1] + "\n");

		// initialization of 2D array
		int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9} };

		// retrieving data
		// first row
		System.out.print(matrix2[0][0] + "\t");
		System.out.print(matrix2[0][1] + "\t");
		System.out.print(matrix2[0][2] + "\n");

		// second row
		System.out.print(matrix2[1][0] + "\t");
		System.out.print(matrix2[1][1] + "\t");
		System.out.print(matrix2[1][2] + "\n");
		
		// third row
		System.out.print(matrix2[2][0] + "\t");
		System.out.print(matrix2[2][1] + "\t");
		System.out.print(matrix2[2][2] + "\n");
		
		// length of 2D array will give number of rows only
		System.out.println(matrix1.length);
		System.out.println(matrix2.length);
		
		// to get the number of columns of every row we can use length propery on row
		// as below
		System.out.println(matrix2[0].length); // no of columns in first row of matrix2
		System.out.println(matrix2[1].length); // no of columns in second row of matrix2
		System.out.println(matrix2[2].length); // no of columns in third row of matrix2
	}

}
