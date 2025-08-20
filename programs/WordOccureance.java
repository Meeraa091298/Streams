package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordOccureance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> wordsOcc = words.stream().collect(Collectors.groupingBy(x->x, Collectors.counting()));
        wordsOcc.forEach((sentence, count) -> System.out.println(sentence + ": " + count));
	}

}
