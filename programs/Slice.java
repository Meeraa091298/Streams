package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Slice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Define slice parameters
        int start = 3;  // Start index (0-based)
        int end = 7;    // End index (exclusive)

        List<Integer> slice = numbers.stream()
                                     .skip(start) // Skip the first 'start' elements
                                     .limit(end - start) // Limit to 'end - start' elements
                                     .collect(Collectors.toList());

        System.out.println("Slice of the Stream: " + slice);

	}

}
