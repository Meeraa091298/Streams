package com.meeraa.stream.api.programs;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "gastroentrologist";
		char ans = a.chars().mapToObj(c-> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(m->m.getValue() == 1)
				.map(m->m.getKey()).findFirst().orElseThrow(() -> new RuntimeException("No non-repeated character found"));
		System.out.println(ans);
	}

}
