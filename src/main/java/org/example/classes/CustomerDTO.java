package org.example.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CustomerDTO {

    private final String firstName;
    private final String lastName;
    private final String email;

}
