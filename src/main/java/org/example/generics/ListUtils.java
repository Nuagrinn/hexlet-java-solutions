package org.example.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//Java Дженерики 5 Параметрический полиморфизм
// Создайте параметризованный класс ListUtils<T>. В классе создайте метод merge(), который принимает два
// параметризованных списка List и сливает их. Метод должен вернуть новый параметризованный список, который представляет
// собой слияние двух переданных списков.

//В классе ListUtils создайте обобщенный статический метод filter, который фильтрует коллекцию. Метод принимает список
// элементов и лямбда-функцию Predicate, которая содержит логику проверки элемента. Метод должен вернуть новый список,
// в котором отсутствуют элементы, не удовлетворяющие условию
public class ListUtils<T> {

    public  List<T> merge(List<T> list1, List<T> list2) {

        List<T> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        return mergedList;
    }

    public static <T> List<T> filter(List<T> listToFilter, Predicate<T> func) {
        List<T> filteredList = new ArrayList<>();

        for (var item : listToFilter) {
            if (func.test(item)) {
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public static void main(String[] args) {

        var languages = new ArrayList<>(List.of("java", "javascript", "php", "ruby"));
        var result = ListUtils.filter(languages, l -> l.startsWith("j"));
        System.out.println(result); // => ["java", "javascript"]

        var numbers = new ArrayList<>(List.of(1, 2, 5, 0, 8, 3));
        var result1 = ListUtils.filter(numbers, n -> n > 4);
        System.out.println(result1); // => [5,

    }

}
