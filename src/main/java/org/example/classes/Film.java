package org.example.classes;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Film {

    private String title;
    private String author;
    private int produced;
    private String genre;
    private String[] actors;
    @EqualsAndHashCode.Exclude
    private int duration;

    public static void main(String[] args) {

        Film film = new Film();
        System.out.println(film.toString());

    }

}
