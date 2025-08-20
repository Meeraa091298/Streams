package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedNumber {
	public static void main (String args[]) {
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
    Integer mostRepeated = numbers.stream()
    	    .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
    	    .entrySet().stream()
    	    .max(Map.Entry.comparingByValue())
    	    .map(Map.Entry::getKey)
    	    .orElse(null);

   System.out.println(mostRepeated);
}}