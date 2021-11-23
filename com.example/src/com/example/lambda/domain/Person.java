package com.example.lambda.domain;

import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private double salary;
    private Gender gender;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, int age, double salary, Gender gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }

    public static List<Person> databasePerson() {
        return Arrays.asList(
                new Person("Maria", 23, 2000, Gender.FEMALE),
                new Person("Joana", 25, 2400, Gender.FEMALE),
                new Person("Sérgio", 29, 4000, Gender.MALE),
                new Person("Osvaldo", 22, 9500, Gender.MALE),
                new Person("Luana", 22, 9500, Gender.FEMALE)
        );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}