package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWordinAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> words = Arrays.asList("apple", "banana", "cherry", "date");

		 Optional<String> longest = words.stream().max((word1, word2) -> Integer.compare(word1.length(),word2.length()));
		 longest.ifPresent(word -> System.out.println("Longest word is: " + word));
		 Optional<String> longest1 = words.stream().max(Comparator.comparing(String::length));
		 longest1.ifPresent(word -> System.out.println("Longest word is: " + word));
	}

}
