package org.example;


public class App {

    public static int sumDigits(int number) {
        var str = Integer.toString(number);
        var result = 0;
        for (var i = 0; i < str.length(); i++) {
            result += Integer.parseInt(Character.toString(str.charAt(i)));
        }

        return result;
    }

    public static Boolean isOneDigitNumber(int number) {
        return number < 10;
    }

    public static int addDigits(int number) {
        var result = number;
        while (!isOneDigitNumber(result)) {
            result = sumDigits(result);
        }

        return result;
    }

    public static void main(String[] args) {



        System.out.println(addDigits(99991999));

    }


}