package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {

	public static void main(String[] args) {
	
		String a = "Gastroentrologist";
		char firstRepeated = a.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(m->m.getValue() >1).map(m->m.getKey()).findFirst().get();
		
		System.out.println(firstRepeated);

	}

}
