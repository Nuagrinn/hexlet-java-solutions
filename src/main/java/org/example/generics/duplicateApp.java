package org.example.generics;

import java.util.ArrayList;
import java.util.List;

//Java Дженерики 3 Примеры встроенных дженериков

//В интерфейсе List есть метод replaceAll(), который принимает в качестве параметра лямбда-функцию, реализующую функциональный
// интерфейс UnaryOperator и заменяет каждый элемент этого списка результатом применения оператора к этому элементу.
// Изучите этот функциональный интерфейс в документации.
//
// В классе App определите публичный статический метод duplicate(), который принимает в качестве параметра список
// целых чисел и возвращает новый список, в котором каждое число умножено на 2

public class duplicateApp {

    public static List<Integer> duplicate(List<Integer> integerList) {

        List<Integer> duplicatedList = new ArrayList<>(integerList);

        duplicatedList.replaceAll((i) -> i * 2);

        return duplicatedList;
    }

    public static void main(String[] args) {
        var numbers = new ArrayList<>(List.of(2, 3, 5));

        var result = duplicate(numbers);

        System.out.println(result); // => [4, 6, 10]
    }

}
