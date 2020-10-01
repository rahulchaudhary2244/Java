// This program by default sorts in ascending order. 
import java.util.Arrays; 

public class SortingArray { 
	public static void main(String[] args) 
	{ 
		int[] ar = { 13, 7, 6, 45, 21, 9, 101, 102 }; 

		Arrays.sort(ar); 

		System.out.printf("Sorted ar[] : %s", 
						Arrays.toString(ar)); 
	} 
} 
