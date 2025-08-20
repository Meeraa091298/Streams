package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 4, 6, 2, 3, 5, 7);
		int target = 10;
		List<String> pair = IntStream.range(0,list.size()).boxed().
				flatMap(i -> IntStream.range(i+1,list.size()).
				filter(j -> list.get(i) + list.get(j) == target).mapToObj(j -> list.get(i) + " + " + list.get(j) + " = " + target))
				.collect(Collectors.toList());		
				pair.forEach(System.out::println);
	}

}
