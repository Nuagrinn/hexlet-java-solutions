package org.example.streams.getuserbyid;

import java.util.ArrayList;
import java.util.List;

// Java Стримы 9 Поиск элементов (find)
public class FindUserByIdApp {

    public static User findUserById(List<User> users, long id) {

        return users.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public static void main(String[] args) {
        var users = new ArrayList(
                List.of(
                        new User(1, "John"),
                        new User(2, "Anna"),
                        new User(3, "Alex")
                )
        );

        var user = findUserById(users, 1);
         // John
        System.out.println(user.getName());

// Пользователя с таким id нет
        findUserById(users, 10); // Error

    }

}
