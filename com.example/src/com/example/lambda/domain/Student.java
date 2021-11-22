package com.example.lambda.domain;

import java.util.Arrays;


public class Student {
    public String name;
    public int age;
    public String[] techs;
    public String birthday;

    public Student(String name, int age, String[] techs, String birthday) {
        this.name = name;
        this.age = age;
        this.techs = techs;
        this.birthday = birthday;
    }

    public static String searchTech(String[] tech, String techName) {
        return Arrays.stream(tech)
                .filter((t) -> t.equals(techName))
                .findAny()
                .orElse("A tecnologia " + techName + " não foi encontrada");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", techs=" + Arrays.toString(techs) +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
