package org.example.javaFunctions.sortBooks;

import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


//Java: Функции 6. ССылки на методы
//В классе App реализуйте публичный статический метод sortBooks(), который принимает на вход список книг List<Book>
// и сортирует его по названию книги в обратном порядке. Метод должен вернуть новый список
public class SortBooksApp {

    public static List<Book> sortBooks(List<Book> unsortedBooks) {

        if(ObjectUtils.isEmpty(unsortedBooks) || unsortedBooks.size() == 1) {
            return new ArrayList<>(unsortedBooks);
        }

        unsortedBooks.sort(Comparator.comparing(Book::getTitle).reversed());

        return new ArrayList<>(unsortedBooks);
    }

    public static void main(String[] args) {
        var books = new ArrayList<>(
                List.of(
                        new Book("Dubliners", "James Joyce"),
                        new Book("Moby-Dick", "Herman Melville"),
                        new Book("The Great Gatsby", "F. Scott Fitzgerald")
                )
        );

        var sortedBooks = sortBooks(books);
        System.out.println(sortedBooks);
    }

}
