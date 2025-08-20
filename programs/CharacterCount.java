package com.meeraa.stream.api.programs;

import java.util.Map;


import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {
		String name = "Meeraa Sundharamoorthy";
		Map<Character, Long> charactercount = name.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		charactercount.forEach((character, count) -> System.out.println("character : " + character + " , " + "count : " + count));
		
//		name.chars(): This method converts the string name into an IntStream of its character codes.
//		.mapToObj(c -> (char) c): This converts each character code to a Character object.
//		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())): 
//			This collects the characters into a Map where the keys are the characters 
//			and the values are the counts of each character.

	}

}
