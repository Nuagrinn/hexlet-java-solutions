package org.example.streams;

import java.util.List;

// Java Стримы 3 отображение
//
// В классе App реализуйте публичный статический метод normalize(), который будет выполнять нормализацию.
// Метод принимает в качестве параметра список List email-адресов и возвращает новый список, в котором каждый email
// нормализован. Нормализация заключается в удалении концевых пробелов и приведении адреса к нижнему регистру
public class normalizeApp {

    public static List<String> normalize(List<String> emailList) {
        return emailList.stream()
                .map(email -> email.trim().toLowerCase())
                .toList();
    }

    public static void main(String[] args) {
        var emails = List.of("Mark@Gmail.com", "  AnnA@mail.io  ", "john@GMAIL.com");
        var result = normalize(emails);
        System.out.println(result); // => [mark@gmail.com, anna@mail.io, john@gmail.com]

    }
}
