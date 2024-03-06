package org.example.generics.listUtils;

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


//В классе ListUtils создайте обобщенный статический метод findFirstIndex(), который на вход принимает список List
// неизвестного типа. Единственное, что известно о типе в списке это то, что он всегда будет унаследован от класса Human.
//
//        Метод принимает на вход два параметра:
//
//        humans - лист неизвестного типа
//        namePrefix - префикс имени для поиска
// Метод ищет в списке первого человека, у которого имя начинается с заданного префикса и возвращает его индекс.
// В случае если ни одного такого человека нет, нужно вернуть значение -1

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

    public static <T> Integer findFirstIndex(List<? extends Human> humanList, String prefix) {

        for(var item: humanList) {
            if(item.getName().startsWith(prefix)) {
                return humanList.indexOf(item);
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        var people = new ArrayList<>(List.of(
                new Woman("Anna"),
                new Woman("Gina"),
                new Woman("Nina")
        ));

        System.out.println(ListUtils.findFirstIndex(people, "G")); // 1
        System.out.println(ListUtils.findFirstIndex(people, "O")); // -1

    }

}
