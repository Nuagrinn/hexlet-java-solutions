package org.example.test.testTake;

import java.util.Arrays;
import static org.example.test.testTake.Methods.*;


//Напишите тесты для метода take(numbers, n), который возвращает массив из первых n значений массива numbers.
// Метод take() уже импортирован в файл с тестами.
//
//Метод принимает два параметра:
//
//массив чисел int[] numbers
//количество элементов в новом массиве, число int n

//Тестирование необходимо провести с использованием ключевого слова assert.
public class MethodsTest {

    public static void testTake() {
        int[] numbers = {1, 2, 3};

        assert Arrays.equals(take(numbers, 2), new int[] {1, 2});
        assert Arrays.equals(take(numbers, 9), new int[] {1, 2, 3});
        assert Arrays.equals(take(new int[] {}, 2), new int[] {});
        assert Arrays.equals(take(numbers, 0), new int[] {});
        assert Arrays.equals(take(numbers, 3), new int[] {1, 2, 3});

        System.out.println("Тесты пройдены!");

    }

    public static void main(String[] args) {
        testTake();
    }
}
