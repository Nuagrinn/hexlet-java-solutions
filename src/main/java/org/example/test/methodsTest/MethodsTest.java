package org.example.test.methodsTest;

//Напишите тесты для метода get(strings, index, defaultValue), который получает элемента массива по индексу,
// при условии что он существует. В ином случае возвращается defaultValue.
//
//массив строк String[] strings
//число int index
//строка String defaultValue
//Идея метода взята из библиотеки org.apache.commons.lang3 — ArrayUtils.get()

// Для хорошего тестирования этого метода, понадобится как минимум три проверки:
//
// 1.Проверка, что метод возвращает нужное значение по существующему индексу (прямой тест на работоспособность)
// 2. Проверки на то, что возвращается значение по умолчанию если индекс выходит за границы массива.
// 3. Индекс может быть как меньше минимального значения, так и больше длины массива


//class StringUtilsTest {
//    public static void testCapitalize() {
//        // Если результат метода не равен ожидаемому значению
//        if (!"Hello".equals(StringUtils.capitalize("hello"))) {
//            // Выбрасываем исключение и завершаем выполнение теста
//            throw new AssertionError("Метод работает неверно!");
//        }
//    }
//}
public class MethodsTest {

    String[] strings = {"hello", "world"};

    public void testGet() {

        if(!strings[1].equals(Methods.get(strings, 1, "value"))) {
            throw new AssertionError("Ожидаемое значение не совпадает с фактическим");
        }
        if(!"value".equals((Methods.get(strings, 2, "value")))) {
            throw new AssertionError("Не получено дефолтно значение");
        }
        if(!"value".equals((Methods.get(strings, -2, "value")))) {
            throw new AssertionError("Неправильная работа при индексе меньше минимального значения");
        }
        System.out.println("Тесты пройдены!");

    }

}
