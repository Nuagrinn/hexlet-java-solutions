package org.example.streams.getAdultUserNames;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

public class GetAverageAgeApp {

    public static Double getAverageAge(List<Person> persons) {
        if(!ObjectUtils.isEmpty(persons)) {
            var totalAge = persons.stream()
                    .reduce(0.0,(sum, person) -> {
                        var age = person.getAge();
                        return sum + age;
                    },
                            Double::sum);
            return totalAge/persons.size();
        }
        return null;
    }

    public static void main(String[] args) {
        var people = new ArrayList(
                List.of(
                        new Person("John", 17),
                        new Person("Anna", 24),
                        new Person("Alex", 57),
                        new Person("Jun", 32)
                )
        );

         // 32.5
        System.out.println(getAverageAge(people));

    }
}
