package com.example.lambda.test;

import com.example.lambda.domain.Student;

import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        String[] studentTech = {"HTML", "CSS", "JavaScript"};
        String[] studentTech2 = {"Java", "PostgreSQL", "Docker"};
        String[] studentTech3 = {"AWS", "Azure",};

        Student student = new Student("Ruan", 22, studentTech, "02/11/1999");
        Student student2 = new Student("João", 23, studentTech2, "05/09/1998");
        Student student3 = new Student("Maria", 31, studentTech3, "10/12/1990");



        String result = Student.searchTech(studentTech, "asasa");

        System.out.println(result);
        System.out.println(student);
    }
}
