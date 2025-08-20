package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ProgramToIterateOverAStreamWithIndicesInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> items = Arrays.asList("apple", "banana", "cherry", "date");

        // Use IntStream to iterate with indices
        IntStream.range(0, items.size())
                 .forEach(index -> System.out.println("Index: " + index + ", Element: " + items.get(index)));


	}

}
