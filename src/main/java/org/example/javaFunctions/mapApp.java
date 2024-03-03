package org.example.javaFunctions;


//Java: Функции 7. Функции высшего порядка

// В классе App создайте публичный статический метод map(), который будет отображать список строк. Метод принимает два параметра:
//
//        Список строк List<String>, исходная коллекция
//        Лямбда-функцию Function<String, String>. Эта функция определяет, что будет происходить с каждым элементом.
//        Функция принимает строку и возвращает строку
//        Метод должен вернуть новый список строк, в котором каждый элемент изменен в соответствии с правилом, определенным
//        в лямбда-функции. Важно, что размер получившегося списка равен размеру исходного списка.
//        Иными словами, нужно применить функцию к каждому элементу списка.

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class mapApp {

    public static List<String> map(List<String> origList, Function<String,String> func) {
        List<String> mappedList = new ArrayList<>();
        for (var item : origList) {
            mappedList.add(func.apply(item));
        }
        return mappedList;
    }

}
