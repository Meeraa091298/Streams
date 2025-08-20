package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximumAndMinimumElementInAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(7, 2, 10, 4, 6);

        int max = numbers.stream().max(Comparator.naturalOrder()).orElseThrow();
        int min = numbers.stream().min(Comparator.naturalOrder()).orElseThrow();

        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);

	}

}
