package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String word = "Welcome onboard to infosys";
				Map<String, Long> occurence = Arrays.stream(word.toLowerCase().split("\\s+"))
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				occurence.forEach((words, count) -> System.out.println(words + " count is "+ count));
	}

}
