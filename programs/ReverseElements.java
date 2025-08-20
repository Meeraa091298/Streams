package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 4, 6, 2, 3, 5, 7);
		List<Integer> reverse = IntStream.range(0, list.size())
				.mapToObj(i -> list.get(list.size() -i-1)).collect(Collectors.toList());
		System.out.println(reverse);
	}

}
