package com.meeraa.stream.api.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Meeraa", 1);
		hashMap.put("Madhu", 3);
		hashMap.put("Sedhu", 5);

		hashMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "  " + entry.getValue()));
	}

}
