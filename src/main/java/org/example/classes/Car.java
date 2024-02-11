package org.example.classes;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Objects;

public final class Car {

    private String made;
    private String model;
    private int produced;

    public Car(String made, String model, int produced) {
        this.made = made;
        this.model = model;
        this.produced = produced;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Car car = (Car) obj;

        return made.equals(car.made) && model.equals(car.model) && produced == car.produced;

    }

    @Override
    public int hashCode() {
        return Objects.hash(made, model, produced);
    }


}
