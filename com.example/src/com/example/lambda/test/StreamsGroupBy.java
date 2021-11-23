package com.example.lambda.test;

import com.example.lambda.domain.Gender;
import com.example.lambda.domain.Person;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamsGroupBy {
    public static void main(String[] args) {
        List<Person> personList = Person.databasePerson();
        Map<Gender, List<Person>> genderListMap = new HashMap<>();
        List<Person> male = new ArrayList<>();
        List<Person> female = new ArrayList<>();

        for (Person person: personList) {
            if (person.getGender().equals(Gender.FEMALE))
                female.add(person);
            else
                male.add(person);
        }

        genderListMap.put(Gender.FEMALE, female);
        genderListMap.put(Gender.MALE, male);

        System.out.println(genderListMap);

        // Usando o mesmo com streams

        Map<Gender, List<Person>> genderListMap02 = personList
                .stream()
                .collect(groupingBy(Person::getGender));

        System.out.println(genderListMap02);

        // Agrupando por quantidade de referencias de genero


        Map<Gender, Long> genderCountingMap = personList
                .stream()
                .collect(groupingBy(Person::getGender, counting()));

        System.out.println(genderCountingMap);

        // Agrupando por maior salário

        Map<Gender, Optional<Person>> genderOrderBySalary = personList
                .stream()
                .collect(groupingBy(Person::getGender, maxBy(comparing(Person::getSalary))));

        System.out.println(genderOrderBySalary);
    }
}
