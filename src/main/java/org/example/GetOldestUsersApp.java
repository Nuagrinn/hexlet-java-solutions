package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GetOldestUsersApp {

    public static List<User> getOldest(List<User> usersList) {
        return getOldest(usersList, 1);
    }

    public static List<User> getOldest(List<User> usersList, int newArrLength) {
        List<User> sortedUsers = new ArrayList<>(usersList);
        sortedUsers.sort((v1, v2) -> v1.getBirthday().compareTo(v2.getBirthday()));

        return new ArrayList<>(sortedUsers.subList(0, Math.min(newArrLength, sortedUsers.size())));
    }


    public static void main(String[] args) {

        var users = List.of(
                new User("Salli", LocalDate.of(1990, 12, 15)),
                new User("Gawen", LocalDate.of(2002, 10, 23)),
                new User("Emmalee", LocalDate.of(1992, 9, 16)),
                new User("Stacee", LocalDate.of(1974, 10, 25)),
                new User("Lydia", LocalDate.of(1987, 5, 10)),
                new User("Annabal", LocalDate.of(1970, 3, 22)),
                new User("Tymon", LocalDate.of(2004, 8, 12)),
                new User("Evania", LocalDate.of(1973, 4, 3))
        );

        var expected = List.of(users.get(5), users.get(7));
        System.out.println(expected);

        var  actual = getOldest(users, 2);
        System.out.println(actual);
    }
}
