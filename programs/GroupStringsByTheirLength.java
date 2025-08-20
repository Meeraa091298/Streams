package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByTheirLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("meeraa", "malini", "shalini", "rohini");
		Map<Integer, List<String>> groupedByLength = list.stream()
	            .collect(Collectors.groupingBy(String::length));
	        System.out.println("Grouped by Length: " + groupedByLength);
	        
//	        The .collect(Collectors.groupingBy(String::length)) method is used in Java's Stream API to group elements of a stream
	        //based on the length of each string. 
//
//	        	.collect: This method is used to transform the elements of a stream into a different form, such as a collection.
//	        	Collectors.groupingBy: This collector groups the elements of the stream by a classifier function.
//	        	String::length: This is a method reference that returns the length of a string.
	}

}
