package com.example.lambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapFunction {
    public static void main(String[] args) {
        List<String> names = List.of("Marcos", "Maria");

        List<Integer> namesLength = mapFunction(names, name -> name.length());

        System.out.println(namesLength);
    }

    private static <T, R> List<R> mapFunction(List<T> list, Function<T, R> func) {
        List<R> result = new ArrayList<>();

        for (T t : list) {
            R r = func.apply(t);
            result.add(r);
        }

        return  result;
    }
}
