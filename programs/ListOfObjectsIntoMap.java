package com.meeraa.stream.api.programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class ListOfObjectsIntoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(
	            new Person(1, "Alice"),
	            new Person(2, "Bob"),
	            new Person(3, "Charlie")
	        );

		Map<Integer, String> listOfObjects = people.stream().collect(Collectors.toMap(Person::getId, Person::getName));
		listOfObjects.forEach((id, name) -> System.out.println(id + ": " + name));

       
	}

}
class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
