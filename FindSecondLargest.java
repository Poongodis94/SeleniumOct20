package week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
	
		Arrays.sort(data);
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);	
		} 
			
		
System.out.println(data[data.length-2]);
		
	}
		//System.out.println(data[data.length-2]);
	
	
	
	}



