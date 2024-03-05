package org.example.generics;

import java.util.ArrayList;
import java.util.List;

//Java Дженерики 5 Параметрический полиморфизм
// Создайте параметризованный класс ListUtils<T>. В классе создайте метод merge(), который принимает два
// параметризованных списка List и сливает их. Метод должен вернуть новый параметризованный список, который представляет
// собой слияние двух переданных списков.
public class ListUtils<T> {

    public  List<T> merge(List<T> list1, List<T> list2) {

        List<T> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        return mergedList;
    }

    public static void main(String[] args) {

        var util = new ListUtils<Integer>();

        var coll1 = new ArrayList<>(List.of(1, 2, 3));
        var coll2 = new ArrayList<>(List.of(3, 4, 5));

        var result = util.merge(coll1, coll2);
        System.out.println(result); // [1, 2, 3, 3, 4, 5]


    }

}
