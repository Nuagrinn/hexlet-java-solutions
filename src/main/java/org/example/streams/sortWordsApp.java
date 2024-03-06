package org.example.streams;

import java.util.ArrayList;
import java.util.List;

//Java Стримы 2
public class sortWordsApp {

    public static List<String> sortWords(List<String> listToSort) {

        return new ArrayList<>(listToSort.stream().sorted().toList());

    }

    public static void main(String[] args) {

        var fruits = List.of("lemon", "apple", "banana");
        var result = sortWords(fruits);
        System.out.println(result); // => [apple, banana, lemon]


    }

}
