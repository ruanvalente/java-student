package com.example.lambda;

import java.util.*;

public class Lambda {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Os números da lista são: " + numbers);

        // Max and Min - Example

        int maxNumber = numbers
                .stream()
                .mapToInt(number -> number)
                .max()
                .orElseThrow();

        System.out.println("O maior número da lista é: " + maxNumber);

        int minNumber = numbers
                .stream()
                .mapToInt(number ->  number)
                .min()
                .orElseThrow();

        System.out.println("O menor número da lista é: " + minNumber);
    }
}
