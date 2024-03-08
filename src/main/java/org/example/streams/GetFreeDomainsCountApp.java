package org.example.streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Java Стримы 7 Стандартные методы свертки

//В классе App реализуйте публичный статический метод getFreeDomainsCount(), который принимает на вход список емейлов
// List<String>. Метод должен вернуть Map<String, Long> — количество email, расположенных на каждом бесплатном домене.
// Список бесплатных доменов хранится в константе FREE_DOMAINS
public class GetFreeDomainsCountApp {

    private static final List<String> FREE_DOMAINS = List.of(
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
            "yahoo.com"
    );

    public static Map<String, Long> getFreeDomainsCount(List<String> emails) {

        return emails.stream()
                .map(email -> email.split("@")[1])
                .filter(FREE_DOMAINS::contains)
                .collect(Collectors.groupingBy(domain -> domain, Collectors.counting()));
    }

    public static void main(String[] args) {
        var emails = List.of(
                "info@yandex.ru",
                "mk@host.com",
                "support@hexlet.io",
                "sergey@gmail.com",
                "vovan@gmail.com",
                "vovan@hotmail.com"
        );

        var result = getFreeDomainsCount(emails);
        System.out.println(result);
    }

}
