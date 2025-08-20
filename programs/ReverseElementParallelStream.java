package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseElementParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Reverse elements using sequential stream
        List<Integer> reversed = numbers.stream()
                                        .sorted(Comparator.reverseOrder()) // Sort in reverse order
                                        .collect(Collectors.toList());

        // Process the reversed list in parallel
        reversed.parallelStream().forEach(System.out::println);

	}

}
