package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;

public class Sum {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int sums = list.stream().reduce(0, Integer::sum);
	        System.out.println("Sum: " + sums);
	
//	.mapToInt(Integer::intValue) method is used in Java's Stream API to convert a stream of Integer objects into an IntStream. 
//
//	        	.mapToInt: This method is used to map each element of the stream to an int value.
//	        	Integer::intValue: This is a method reference that converts an Integer object to its primitive int value.
//	        	So, if you have a stream of Integer objects and you want to perform operations that require primitive int values,
//	        	you can use .mapToInt(Integer::intValue) to achieve that.
		

	}

}
