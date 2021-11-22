package com.example.lambda.test;

import java.util.List;
import java.util.function.Consumer;

public class ForEachConsumer {
    public static void main(String[] args) {
        List<String> names = List.of("João", "Bruno", "Marcos");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);


        forEachTest(names, name -> System.out.println(name));
        forEachTest(numbers, number -> System.out.println(number));
    }

    private static <T> void forEachTest(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
