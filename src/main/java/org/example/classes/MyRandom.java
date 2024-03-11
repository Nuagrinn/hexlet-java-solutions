package org.example.classes;

import java.util.Random;

public class MyRandom {

    public static final int MIN_BOUND = 1;
    public static final int MAX_BOUND = 100;

    public static int generate() {
        return new Random().nextInt(MIN_BOUND, MAX_BOUND);
    }

}
