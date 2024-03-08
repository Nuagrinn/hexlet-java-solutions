package org.example.streams.getgenres;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Java Стримы 8 FlatMap

//В классе App реализуйте публичный статический метод getGenres(), который принимает в качестве параметра список
// фильмов List<Film>. Метод должен вернуть Map<String, Long>, в котором ключ — это название жанра,
// а значение — количество фильмов в этом жанре. Нормализуйте название жанра перед подсчетом
public class GetGenresApp {

    public static Map<String, Long> getGenres(List<Film> fimls) {
        return fimls.stream()
                .flatMap(film ->film.getGenres().stream())
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }

    public static void main(String[] args) {
        var films = List.of(
                new Film("Liquid Sky", List.of("thriller", "Action")),
                new Film("Superman", List.of("Action", "fantasy", "thriller")),
                new Film("Norwegian Ninja", List.of("THRILLER"))
        );

        var result = getGenres(films);
        System.out.println(result); // => {"action"=2,"thriller"=3,"fantasy"=1}

    }
}
