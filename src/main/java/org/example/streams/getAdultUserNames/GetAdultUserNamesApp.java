package org.example.streams.getAdultUserNames;

import java.util.ArrayList;
import java.util.List;

//В классе App реализуйте публичный статический метод getAdultUserNames(), который принимает в качестве параметра список
// персон List<Person>. Метод должен вернуть новый список с именами людей, которым уже исполнилось 18 лет
public class GetAdultUserNamesApp {
    public static List<String> getAdultUserNames(List<Person> personList) {

        return personList.stream()
                .filter(p -> p.getAge() >= 18)
                .map(Person::getName)
                .toList();
    }

    public static void main(String[] args) {
        var people = new ArrayList(
                List.of(
                        new Person("John", 17),
                        new Person("Anna", 24),
                        new Person("Alex", 35)
                )
        );

        var names = getAdultUserNames(people);
        System.out.println(names); // => [Anna, Alex]

    }


}
