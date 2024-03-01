package org.example.javaFunctions;


// Java: Функции 4. Методы Compute в Map
// Реализуйте публичный статический метод countNumbers(), который принимает в качестве параметра список целых чисел
// и подсчитывает количество положительных, отрицательных чисел и нулей в этом списке. Метод должен вернуть Map,
// где ключом будет строка - тип числа ("positive", "negative" или "zero"), а значением - количество чисел данного типа

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountNumberApp {

    public static Map<String, Integer> countNumbers(List<Integer> integerList) {


        Map<String, Integer> countResult = new HashMap<>();
        countResult.put("negative", 0);
        countResult.put("positive", 0);
        countResult.put("zero", 0);

        integerList.forEach((sign) ->
                countResult.compute(defineSign(sign), (key, count) -> count == null ? 1 : count + 1)
        );

        return countResult;
    }

    public static String defineSign (Integer integer) {
        return (integer > 0) ? "positive" : (integer < 0) ? "negative" : "zero";
    }

}
