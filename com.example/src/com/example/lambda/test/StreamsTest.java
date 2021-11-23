package com.example.lambda.test;

import com.example.lambda.domain.Person;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTest {
    public static void main(String[] args) {
        // Pega os 3 primeiros nomes das pessoas com menos de 25 anos
        // ordenados pelo nome.

        List<Person> personList = Person.databasePerson();

        //Collections.sort(person, (person, person2) -> person.getName().compareTo(person2.getName()));
        personList.sort(Comparator.comparing(Person::getName));

        List<String> names = personList
                .stream()
                .filter((person) -> person.getAge() <= 25)
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
