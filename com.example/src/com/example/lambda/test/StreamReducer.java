package com.example.lambda.test;

import com.example.lambda.domain.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamReducer {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> sumAllNumbers = numbers
                .stream()
                .reduce((x, y) -> x + y);
        Integer sumAllNumbers02 = numbers
                .stream()
                .reduce(0, Integer::sum);

//        System.out.println(sumAllNumbers.get());
//        System.out.println(sumAllNumbers02);

        Stream<Person> allSalary = Person.databasePerson().stream();

        Double totalSalaries = allSalary
                .mapToDouble(Person::getSalary)
                .reduce(0.0, Double::sum);

        Double filteredSalary = Person.databasePerson()
                .stream()
                .filter((salary) -> salary.getSalary() < 4000)
                .mapToDouble(Person::getSalary)
                .sum();

        System.out.println(totalSalaries);
        System.out.println(filteredSalary);
    }
}
