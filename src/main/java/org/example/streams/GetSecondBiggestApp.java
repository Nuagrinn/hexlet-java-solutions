package org.example.streams;


import org.apache.commons.lang3.ObjectUtils;

import java.util.List;

//Java Стримы 10 Эффективное использование
//В классе App реализуйте публичный статический метод getSecondBiggest(), который принимает в качестве параметра список
// целых чисел List<Integer>. Метод должен вернуть второе по величине число из списка. Если найти такое число
// не представляется возможным (например, список пуст или в нем только один элемент), метод должен вернуть null
public class GetSecondBiggestApp {

    public static Integer getSecondBiggest(List<Integer> ints) {

        var biggestFirst = ints.stream().max(Integer::compareTo).orElse(null);
        if(ObjectUtils.isEmpty(biggestFirst)) {
            return biggestFirst;
        } else {
            return ints.stream()
                    .sorted((v1, v2) -> v2.compareTo(v1))
                    .filter(v1 -> v1 < biggestFirst)
                    .findFirst().orElse(null);
        }

    }

    public static void main(String[] args) {
        var numbers = List.of(3, -5, 6, 1, 0, -2, 10);

        System.out.println(getSecondBiggest(numbers));
    }

}
