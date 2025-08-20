package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAndRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
		List<String> result = list.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
		
		Map<String, Long> newList = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		List<String> duplicates = newList.entrySet().stream()
						.filter(m-> m.getValue()>1).map(m-> m.getKey()).collect(Collectors.toList());
				
				System.out.println(duplicates);
		
		

	}

}
