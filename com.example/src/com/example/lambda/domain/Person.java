package com.example.lambda.domain;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static List<Person> databasePerson() {
        return Arrays.asList(
                new Person("Maria", 23, 2000),
                new Person("Joana", 25, 2400),
                new Person("Sérgio", 29, 4000),
                new Person("Osvaldo", 22, 9500),
                new Person("Luana", 22, 9500)
        );
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}