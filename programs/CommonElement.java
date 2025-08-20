package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 6, 2, 3, 5, 7);
		List<Integer> list2 = Arrays.asList(1, 5, 9, 4, 3, 2, 8);
		List<Integer> list3 = list.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println(list3);

	}

}
