package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(6,9,2,4,5,3,1,7,8);
		List<Integer> evenNo = list.stream()
				.filter(n -> n%2==0)
				.collect(Collectors.toList());
		System.out.println("Even Numbers: " + evenNo);
		
		
}
}