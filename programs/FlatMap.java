package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> listOfLists = Arrays.asList(
	            Arrays.asList("apple", "banana"),
	            Arrays.asList("cherry", "date")
	        );
		List<String> flatMaps = listOfLists.stream()
			    .flatMap(List::stream)
			    .collect(Collectors.toList());
		System.out.println(flatMaps);
	}

}
