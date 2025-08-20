package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToUppercase {

	public static void main(String[] args) {
		 List<String> list = Arrays.asList("meeraa", "malini", "shalini", "rohini");
		 List<String> uppercase = list.stream().map(String :: toUpperCase).collect(Collectors.toList());
		 System.out.println("Uppercase" + uppercase);

		 
//		 The map(String::toUpperCase) method is used in Java's Stream API to convert each string in a stream to its uppercase form.
//
//			 map: This method is used to apply a function to each element of the stream.
//			 String::toUpperCase: This is a method reference that converts a string to its uppercase equivalent.
//			 So, if you have a stream of strings and you want to convert all of them to uppercase, 
//			 you can use map(String::toUpperCase).
	}

}
