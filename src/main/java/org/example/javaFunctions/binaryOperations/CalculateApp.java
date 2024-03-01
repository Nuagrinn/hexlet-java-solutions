package org.example.javaFunctions.binaryOperations;

// Java: Функции 5 Функциональный интерфейс (Functional Interface)
//Создайте функциональный интерфейс BinaryOperation, который будет представлять бинарную операцию.
//Так как операция бинарная, единственный метод интерфейса должен принимать два параметра - целые числа и возвращать целое число
//В классе App создайте публичный статический метод calculate(), который будет принимать три параметра:
//
//        два целых числа - операнды
//        лямбду, которая реализует интерфейс BinaryOperation
//Метод должен вернуть целое число - результат применения бинарной операции к переданным в метод числам


public class CalculateApp {

    public static int calculate (int a, int b, BinaryOperation func) {
       return func.operate(a, b);
    }

    public static void main(String[] args) {
        BinaryOperation add = Integer::sum;
        calculate(6, 5, add); // 11

        BinaryOperation sub = (a, b) -> a - b;
        calculate(6, 5, sub); // 1

    }

}
