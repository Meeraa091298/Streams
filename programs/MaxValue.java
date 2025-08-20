package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxValue {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,9,7,6,4);
	Optional<Integer> max = list.stream().sorted(Comparator.reverseOrder()).findFirst();
	
	Optional<Integer> secondLargest = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	secondLargest.ifPresentOrElse(
            num -> System.out.println("Second highest number is: " + num),
            () -> System.out.println("List does not have a second highest number")
        );

	System.out.println("max: " + max);
	System.out.println("secondLargest: " + secondLargest);
	//or
	
//	Optional<Integer> max = numbers.stream()
//            .max(Integer::compareTo);
//        max.ifPresent(value -> System.out.println("Max Value: " + value));
	
	
//	The max(Integer::compareTo) method is used in Java's Stream API to find the maximum element in a stream of Integer objects.
//	Here's a brief explanation:
//
//		max: This method is used to find the maximum element according to the provided comparator.
//		Integer::compareTo: This is a method reference that compares two Integer objects.
	}

}
