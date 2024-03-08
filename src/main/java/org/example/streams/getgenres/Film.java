package org.example.streams.getgenres;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.List;

@Getter
@AllArgsConstructor
public final class Film {

    private String name;
    private List<String> genres;
}
