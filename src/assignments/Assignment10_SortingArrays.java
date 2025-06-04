package assignments;

import java.util.Arrays;

public class Assignment10_SortingArrays {

	public static void main(String[] args) {
	 // Declare and initialize an integer array with some unsorted numbers
		int[] array= {12,34,11,36,87,98,93};
		
		Arrays.sort(array);
		//Store the values in Array and Print second and third largest number
		System.out.println(array[array.length-2]);
		System.out.println(array[array.length-3]);
		
				
			}
		

	}


